package com.strightflow.rest.controller;

import com.strightflow.core.dform.*;
import com.strightflow.core.events.fieldconfiguration.*;
import com.strightflow.core.services.FieldConfigurationService;
import com.strightflow.rest.domain.FieldConfigurationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * Created by yermak on 22/5/14.
 */

@Controller
@RequestMapping("/rest/field_configuration")
public class FieldConfigurationCommandsController extends WebController {


    private static Logger LOG = LoggerFactory.getLogger(FieldConfigurationCommandsController.class);

    @Autowired
    private FieldConfigurationService fieldConfigurationService;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List> list() {
        ListedFieldConfigurationEvent event = fieldConfigurationService.list(new ListFieldConfigurationEvent());

        return new ResponseEntity<List>(event.getFieldConfigurationInfos(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/edit/{id}")
    public @ResponseBody
    Map edit(@PathVariable String id) {
        LoadedFieldConfigurationEvent event = fieldConfigurationService.load(new LoadFieldConfigurationEvent(id));
        FieldConfigurationInfo fieldConfigurationInfo = event.getFieldConfigurationInfo();
        Form form = createDForm(fieldConfigurationInfo.getName());
        form.add(new Tag("p", "Modify FieldConfiguration information"));

        Text fieldConfigurationNameText = new Text("fieldConfigurationNameTextId", "fieldConfigurationNameText", "Name", fieldConfigurationInfo.getName());
        form.add(fieldConfigurationNameText);
        form.add(new Tag("br"));

        TextArea fieldConfigurationDescriptionArea = new TextArea("fieldConfigurationDescriptionAreaId", "fieldConfigurationDescriptionArea", "Description", fieldConfigurationInfo.getDescription());
        form.add(fieldConfigurationDescriptionArea);
        form.add(new Tag("br"));

        Hidden fieldConfigurationId = new Hidden("namespaceIdId", "namespaceId", fieldConfigurationInfo.getId());
        form.add(fieldConfigurationId);

        Submit submit = new Submit("fieldConfigurationSubmitId", "fieldConfigurationSubmit", "Save");
        form.add(submit);

        return form.getParameters();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public @ResponseBody
    ResponseEntity<DeletedFieldConfigurationEvent> delete(@PathVariable String id) {
        DeletedFieldConfigurationEvent event = fieldConfigurationService.delete(new DeleteFieldConfigurationEvent(id));

        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setLocation(new URI("/field_configuration").toURL().toURI());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<DeletedFieldConfigurationEvent>(event, headers, HttpStatus.TEMPORARY_REDIRECT);


    }
}

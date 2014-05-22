package com.strightflow.rest.controller;

import com.strightflow.core.events.fieldconfiguration.ListFieldConfigurationEvent;
import com.strightflow.core.events.fieldconfiguration.ListedFieldConfigurationEvent;
import com.strightflow.core.services.FieldConfigurationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by yermak on 22/5/14.
 */

@Controller
@RequestMapping("/rest/field_configuration")
public class FieldConfigurationCommandsController {


    private static Logger LOG = LoggerFactory.getLogger(FieldConfigurationCommandsController.class);

    @Autowired
    private FieldConfigurationService fieldConfigurationService;


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List> list() {
        ListedFieldConfigurationEvent event = fieldConfigurationService.requestAll(new ListFieldConfigurationEvent());

        return new ResponseEntity<List>(event.getFieldConfigurationInfos(), HttpStatus.OK);
    }

}

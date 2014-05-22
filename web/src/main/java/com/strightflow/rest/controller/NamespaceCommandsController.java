package com.strightflow.rest.controller;

import com.strightflow.core.events.CreatedEvent;
import com.strightflow.core.events.DeletedEvent;
import com.strightflow.core.events.namespace.*;
import com.strightflow.core.services.NamespaceService;
import com.strightflow.rest.domain.NamespaceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */

@Controller
@RequestMapping("/rest/namespace")
public class NamespaceCommandsController {

    private static Logger LOG = LoggerFactory.getLogger(NamespaceCommandsController.class);

    @Autowired
    private NamespaceService namespaceService;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<NamespaceInfo> create(@RequestBody NamespaceInfo namespace, UriComponentsBuilder builder) {

        CreatedEvent createdEvent = namespaceService.create(new CreateNamespaceEvent());


        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(
//                builder.path("/aggregators/entity/{id}")
//                        .buildAndExpand(entityCreated.getId().toString()).toUri()
//        );

        NamespaceInfo newNamespace = null;
        return new ResponseEntity<NamespaceInfo>(newNamespace, headers, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List> list() {
        ListedNamespaceEvent event = namespaceService.requestAll(new ListNamespaceEvent());


//        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(
//                builder.path("/aggregators/namespace/")
//                        .buildAndExpand().toUri()
//        );

        System.out.println("event.getNamespaceInfos().size() = " + event.getNamespaceInfos().size());
        return new ResponseEntity<List>(event.getNamespaceInfos(), HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<NamespaceInfo> delete(@PathVariable String id) {

        DeletedEvent entityDeleted = namespaceService.delete(new DeleteNamespaceEvent());


        NamespaceInfo namespace = null;
//        if (entityDeleted.isDeletionCompleted()) {
//            return new ResponseEntity<Entity>(entity, HttpStatus.OK);
//        }

        return new ResponseEntity<NamespaceInfo>(namespace, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public @ResponseBody NamespaceInfo load(@PathVariable String id) {
        LoadedNamespaceEvent loadedEvent = namespaceService.requestDetails(new LoadNamespaceEvent(id));
        NamespaceInfo namespace = loadedEvent.getInfo();
        System.out.println("namespace = " + namespace);
        return namespace;
    }

}

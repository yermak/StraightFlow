package com.strightflow.rest.controller;

import com.strightflow.core.events.*;
import com.strightflow.core.events.entity.CreateEntityEvent;
import com.strightflow.core.events.entity.DeleteEntityEvent;
import com.strightflow.core.events.entity.EntityCreatedEvent;
import com.strightflow.core.events.entity.EntityDeletedEvent;
import com.strightflow.core.services.EntityService;
import com.strightflow.core.services.NamespaceService;
import com.strightflow.rest.domain.Entity;
import com.strightflow.rest.domain.Namespace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */

@Controller
@RequestMapping("/aggregators/namespace")
public class NamespaceCommandsController {

    private static Logger LOG = LoggerFactory.getLogger(NamespaceCommandsController.class);

    @Autowired
    private NamespaceService namespaceService;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Namespace> create(@RequestBody Namespace namespace, UriComponentsBuilder builder) {

        CreatedEvent createdEvent = namespaceService.create(new CreateEvent());


        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(
//                builder.path("/aggregators/entity/{id}")
//                        .buildAndExpand(entityCreated.getId().toString()).toUri()
//        );

        Namespace newNamespace = null;
        return new ResponseEntity<Namespace>(newNamespace, headers, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List> list(@RequestBody Namespace namespace, UriComponentsBuilder builder) {

        ReadEvent event = namespaceService.requestAll(new RequestReadEvent());


        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(
                builder.path("/aggregators/namespace/")
                        .buildAndExpand().toUri()
        );


        return new ResponseEntity<List>(new ArrayList(), headers, HttpStatus.CREATED);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Namespace> delete(@PathVariable String id) {

        DeletedEvent entityDeleted = namespaceService.delete(new DeleteEvent());


        Namespace namespace = null;
//        if (entityDeleted.isDeletionCompleted()) {
//            return new ResponseEntity<Entity>(entity, HttpStatus.OK);
//        }

        return new ResponseEntity<Namespace>(namespace, HttpStatus.OK);
    }

}

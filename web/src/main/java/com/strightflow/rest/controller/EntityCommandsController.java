package com.strightflow.rest.controller;

import com.strightflow.core.events.entity.CreateEntityEvent;
import com.strightflow.core.events.entity.DeleteEntityEvent;
import com.strightflow.core.events.entity.EntityCreatedEvent;
import com.strightflow.core.events.entity.EntityDeletedEvent;
import com.strightflow.core.services.EntityService;
import com.strightflow.rest.domain.EntityInfo;
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

/**
 * Created by yermak on 29/4/14.
 */

@Controller
@RequestMapping("/rest/entity")
public class EntityCommandsController {

    private static Logger LOG = LoggerFactory.getLogger(EntityCommandsController.class);

    @Autowired
    private EntityService entityService;


    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<EntityInfo> createEntity(@RequestBody EntityInfo entity, UriComponentsBuilder builder) {

        EntityCreatedEvent entityCreated = entityService.createEntity(new CreateEntityEvent());


        HttpHeaders headers = new HttpHeaders();
//        headers.setLocation(
//                builder.path("/aggregators/entity/{id}")
//                        .buildAndExpand(entityCreated.getId().toString()).toUri()
//        );

        EntityInfo newEntity = null;
        return new ResponseEntity<EntityInfo>(newEntity, headers, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<EntityInfo> deleteEntity(@PathVariable String id) {

        EntityDeletedEvent entityDeleted = entityService.deleteEntity(new DeleteEntityEvent());


        EntityInfo entity = null;
//        if (entityDeleted.isDeletionCompleted()) {
//            return new ResponseEntity<Entity>(entity, HttpStatus.OK);
//        }

        return new ResponseEntity<EntityInfo>(entity, HttpStatus.FORBIDDEN);
    }

}

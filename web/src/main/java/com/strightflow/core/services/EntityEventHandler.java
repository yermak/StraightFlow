package com.strightflow.core.services;

import com.strightflow.core.events.entity.*;
import com.strightflow.core.repository.EntityRepository;

/**
 * Created by yermak on 29/4/14.
 */
public class EntityEventHandler implements EntityService {

    private EntityRepository repository;

    public EntityEventHandler(EntityRepository repository) {
        this.repository = repository;
    }

    @Override
    public AllEntitiesEvent requestAllEntities(RequestAllEntitiesEvent event) {
        return null;
    }

    @Override
    public EntityDetailsEvent requestEntityDetails(RequestEntityDetailsEvent event) {
        return null;
    }

    @Override
    public EntityCreatedEvent createEntity(CreateEntityEvent event) {
        return null;
    }

    @Override
    public EntityDeletedEvent deleteEntity(DeleteEntityEvent event) {
        return null;
    }
}

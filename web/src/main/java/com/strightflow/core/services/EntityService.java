package com.strightflow.core.services;

import com.strightflow.core.events.entity.*;

/**
 * Created by yermak on 29/4/14.
 */
public interface EntityService {

    public AllEntitiesEvent requestAllEntities(RequestAllEntitiesEvent event);

    public EntityDetailsEvent requestEntityDetails(RequestEntityDetailsEvent event);

    public EntityCreatedEvent createEntity(CreateEntityEvent event);

    public EntityDeletedEvent deleteEntity(DeleteEntityEvent event);

}

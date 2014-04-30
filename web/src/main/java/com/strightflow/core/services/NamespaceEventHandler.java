package com.strightflow.core.services;

import com.strightflow.core.domain.Namespace;
import com.strightflow.core.events.*;
import com.strightflow.core.events.namespace.LoadNamespaceEvent;
import com.strightflow.core.events.namespace.NamespaceLoadedEvent;
import com.strightflow.core.repository.NamespaceRepository;
import com.strightflow.rest.domain.NamespaceInfo;
import org.springframework.beans.BeanUtils;

/**
 * Created by yermak on 29/4/14.
 */
public class NamespaceEventHandler implements NamespaceService {

    private NamespaceRepository repository;

    public NamespaceEventHandler(NamespaceRepository repository) {
        this.repository = repository;
    }

    @Override
    public ReadEvent requestAll(RequestReadEvent event) {
        return null;
    }

    @Override
    public NamespaceLoadedEvent requestDetails(LoadNamespaceEvent event) {
        Namespace namespace = repository.findById(event.getNamespaceId());
        System.out.println("namespace = " + namespace);
        NamespaceInfo namespaceInfo = new NamespaceInfo();
        BeanUtils.copyProperties(namespace, namespaceInfo);
        return new NamespaceLoadedEvent(namespaceInfo);
    }

    @Override
    public CreatedEvent create(CreateEvent event) {
        return null;
    }

    @Override
    public DeletedEvent delete(DeleteEvent event) {
        return null;
    }

}

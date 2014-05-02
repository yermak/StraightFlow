package com.strightflow.core.services;

import com.strightflow.core.domain.Namespace;
import com.strightflow.core.events.*;
import com.strightflow.core.events.namespace.LoadNamespaceEvent;
import com.strightflow.core.events.namespace.NamespaceLoadedEvent;
import com.strightflow.core.repository.NamespaceRepository;
import com.strightflow.rest.domain.NamespaceInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */
public class NamespaceEventHandler implements NamespaceService {

    private NamespaceRepository repository;

    public NamespaceEventHandler(NamespaceRepository repository) {
        this.repository = repository;
    }

    @Override
    public NamespaceListedEvent requestAll(RequestReadEvent event) {
        List<Namespace> namespaces = repository.findAll();
        List<NamespaceInfo> namespaceInfos = new ArrayList<NamespaceInfo>();
        for (Namespace namespace : namespaces) {
            NamespaceInfo namespaceInfo = new NamespaceInfo();
            BeanUtils.copyProperties(namespace, namespaceInfo);
            namespaceInfos.add(namespaceInfo);
        }
        return new NamespaceListedEvent(namespaceInfos);
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
    public NamespaceCreatedEvent create(CreateNamespaceEvent event) {
        return null;
    }

    @Override
    public NamespaceDeletedEvent delete(DeleteNamespaceEvent event) {
        return null;
    }

}

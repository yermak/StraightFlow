package com.strightflow.core.services;

import com.strightflow.core.domain.Namespace;
import com.strightflow.core.events.*;
import com.strightflow.core.events.namespace.*;
import com.strightflow.core.repository.NamespaceRepository;
import com.strightflow.rest.domain.NamespaceInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */

@Service
public class NamespaceEventHandler implements NamespaceService {

    @Autowired
    private NamespaceRepository repository;

    @Override
    public ListedNamespaceEvent requestAll(ListEvent event) {
        List<Namespace> namespaces = repository.findAll();
        List<NamespaceInfo> namespaceInfos = new ArrayList<NamespaceInfo>();
        for (Namespace namespace : namespaces) {
            NamespaceInfo namespaceInfo = new NamespaceInfo();
            BeanUtils.copyProperties(namespace, namespaceInfo);
            namespaceInfos.add(namespaceInfo);
        }
        return new ListedNamespaceEvent(namespaceInfos);
    }

    @Override
    public LoadedNamespaceEvent requestDetails(LoadNamespaceEvent event) {
        Namespace namespace = repository.findById(event.getNamespaceId());
        System.out.println("namespace = " + namespace);
        NamespaceInfo namespaceInfo = new NamespaceInfo();
        BeanUtils.copyProperties(namespace, namespaceInfo);
        return new LoadedNamespaceEvent(namespaceInfo);
    }

    @Override
    public CreatedNamespaeEvent create(CreateNamespaceEvent event) {
        return null;
    }

    @Override
    public DeletedNamespaceEvent delete(DeleteNamespaceEvent event) {
        return null;
    }

}

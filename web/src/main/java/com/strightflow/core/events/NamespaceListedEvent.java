package com.strightflow.core.events;

import com.strightflow.rest.domain.NamespaceInfo;

import java.util.List;

/**
 * Created by yermak on 2/5/14.
 */
public class NamespaceListedEvent extends ReadEvent {
    private List<NamespaceInfo> namespaceInfos;

    public NamespaceListedEvent(List<NamespaceInfo> namespaceInfos) {
        this.namespaceInfos = namespaceInfos;
    }

    public List<NamespaceInfo> getNamespaceInfos() {
        return namespaceInfos;
    }
}

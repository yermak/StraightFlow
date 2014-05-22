package com.strightflow.core.events.namespace;

import com.strightflow.core.events.ListedEvent;
import com.strightflow.rest.domain.NamespaceInfo;

import java.util.List;

/**
 * Created by yermak on 2/5/14.
 */
public class ListedNamespaceEvent extends ListedEvent {
    private List<NamespaceInfo> namespaceInfos;

    public ListedNamespaceEvent(List<NamespaceInfo> namespaceInfos) {
        this.namespaceInfos = namespaceInfos;
    }

    public List<NamespaceInfo> getNamespaceInfos() {
        return namespaceInfos;
    }
}

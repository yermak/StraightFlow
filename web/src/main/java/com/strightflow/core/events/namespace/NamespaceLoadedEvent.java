package com.strightflow.core.events.namespace;

import com.strightflow.core.events.ReadEvent;
import com.strightflow.rest.domain.NamespaceInfo;

/**
 * Created by yermak on 30/4/14.
 */
public class NamespaceLoadedEvent extends ReadEvent {

    private NamespaceInfo namespaceInfo;

    public NamespaceLoadedEvent(NamespaceInfo namespaceInfo) {
        this.namespaceInfo = namespaceInfo;
    }

    public NamespaceInfo getInfo() {
        return namespaceInfo;
    }
}

package com.strightflow.core.events.namespace;

import com.strightflow.core.events.LoadedEvent;
import com.strightflow.rest.domain.NamespaceInfo;

/**
 * Created by yermak on 30/4/14.
 */
public class LoadedNamespaceEvent extends LoadedEvent {

    private NamespaceInfo namespaceInfo;

    public LoadedNamespaceEvent(NamespaceInfo namespaceInfo) {
        this.namespaceInfo = namespaceInfo;
    }

    public NamespaceInfo getInfo() {
        return namespaceInfo;
    }
}

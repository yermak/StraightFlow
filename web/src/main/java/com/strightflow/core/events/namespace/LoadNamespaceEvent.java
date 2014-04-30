package com.strightflow.core.events.namespace;

import com.strightflow.core.events.RequestReadEvent;

/**
 * Created by yermak on 30/4/14.
 */
public class LoadNamespaceEvent extends RequestReadEvent {
    private String id;

    public LoadNamespaceEvent(String id) {
        this.id = id;
    }

    public String getNamespaceId() {
        return id;
    }
}

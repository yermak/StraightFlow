package com.strightflow.core.services;

import com.strightflow.core.events.*;
import com.strightflow.core.events.namespace.LoadNamespaceEvent;
import com.strightflow.core.events.namespace.NamespaceLoadedEvent;

/**
 * Created by yermak on 29/4/14.
 */
public interface NamespaceService {
    public NamespaceListedEvent requestAll(RequestReadEvent event);

    public NamespaceLoadedEvent requestDetails(LoadNamespaceEvent event);

    public NamespaceCreatedEvent create(CreateNamespaceEvent event);

    public NamespaceDeletedEvent delete(DeleteNamespaceEvent event);
}

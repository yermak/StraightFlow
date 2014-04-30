package com.strightflow.core.services;

import com.strightflow.core.events.*;
import com.strightflow.core.events.namespace.LoadNamespaceEvent;
import com.strightflow.core.events.namespace.NamespaceLoadedEvent;

/**
 * Created by yermak on 29/4/14.
 */
public interface NamespaceService {
    public ReadEvent requestAll(RequestReadEvent event);

    public NamespaceLoadedEvent requestDetails(LoadNamespaceEvent event);

    public CreatedEvent create(CreateEvent event);

    public DeletedEvent delete(DeleteEvent event);
}

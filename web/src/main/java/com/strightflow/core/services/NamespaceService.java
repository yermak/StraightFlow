package com.strightflow.core.services;

import com.strightflow.core.events.ListEvent;
import com.strightflow.core.events.namespace.*;

/**
 * Created by yermak on 29/4/14.
 */
public interface NamespaceService {
    public ListedNamespaceEvent requestAll(ListEvent event);

    public LoadedNamespaceEvent requestDetails(LoadNamespaceEvent event);

    public CreatedNamespaeEvent create(CreateNamespaceEvent event);

    public DeletedNamespaceEvent delete(DeleteNamespaceEvent event);
}

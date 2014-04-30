package com.strightflow.core.services;

import com.strightflow.core.events.*;
import com.strightflow.core.repository.NamespaceRepository;

/**
 * Created by yermak on 29/4/14.
 */
public class NamespaceEventHandler implements NamespaceService {

    public NamespaceEventHandler(NamespaceRepository repository) {

    }

    @Override
    public ReadEvent requestAll(RequestReadEvent event) {
        return null;
    }

    @Override
    public ReadEvent requestDetails(RequestReadEvent event) {
        return null;
    }

    @Override
    public CreatedEvent create(CreateEvent event) {
        return null;
    }

    @Override
    public DeletedEvent delete(DeleteEvent event) {
        return null;
    }

}

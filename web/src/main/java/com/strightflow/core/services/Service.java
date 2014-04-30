package com.strightflow.core.services;

import com.strightflow.core.events.*;

/**
 * Created by yermak on 29/4/14.
 */
public interface Service {

    public ReadEvent requestAll(RequestReadEvent event);

    public ReadEvent requestDetails(RequestReadEvent event);

    public CreatedEvent create(CreateEvent event);

    public DeletedEvent delete(DeleteEvent event);

}

package com.strightflow.core.events.fieldconfiguration;

import com.strightflow.core.events.DeletedEvent;

/**
 * Created by yermak on 22/5/14.
 */
public class DeletedFieldConfigurationEvent extends DeletedEvent {
    private String fieldConfigurationId;

    public DeletedFieldConfigurationEvent(String fieldConfigurationId) {
        this.fieldConfigurationId = fieldConfigurationId;
    }

    public String getFieldConfigurationId() {
        return fieldConfigurationId;
    }
}

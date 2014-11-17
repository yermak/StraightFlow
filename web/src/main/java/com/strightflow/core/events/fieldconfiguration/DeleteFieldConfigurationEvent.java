package com.strightflow.core.events.fieldconfiguration;

import com.strightflow.core.events.DeletedEvent;

/**
 * Created by yermak on 22/5/14.
 */
public class DeleteFieldConfigurationEvent extends DeletedEvent {
    private String fieldConfigurationId;

    public DeleteFieldConfigurationEvent(String fieldConfigurationId) {
        this.fieldConfigurationId = fieldConfigurationId;
    }

    public String getFieldConfigurationId() {
        return fieldConfigurationId;
    }
}

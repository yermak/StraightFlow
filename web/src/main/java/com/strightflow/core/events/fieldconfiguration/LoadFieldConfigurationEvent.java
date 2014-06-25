package com.strightflow.core.events.fieldconfiguration;

import com.strightflow.core.events.LoadEvent;

/**
 * Created by yermak on 29/5/14.
 */
public class LoadFieldConfigurationEvent extends LoadEvent {
    private String fieldConfigurationId;

    public LoadFieldConfigurationEvent(String fieldConfigurationId) {
        this.fieldConfigurationId = fieldConfigurationId;
    }

    public String getFieldConfigurationId() {
        return fieldConfigurationId;
    }
}

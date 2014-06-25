package com.strightflow.core.events.fieldconfiguration;

import com.strightflow.core.events.LoadedEvent;
import com.strightflow.rest.domain.FieldConfigurationInfo;

import java.util.List;

/**
 * Created by yermak on 29/5/14.
 */
public class LoadedFieldConfigurationEvent extends LoadedEvent {

    private FieldConfigurationInfo fieldConfigurationInfo;

    public LoadedFieldConfigurationEvent(FieldConfigurationInfo fieldConfigurationInfo) {
        this.fieldConfigurationInfo = fieldConfigurationInfo;
    }

    public FieldConfigurationInfo getFieldConfigurationInfo() {
        return fieldConfigurationInfo;
    }
}

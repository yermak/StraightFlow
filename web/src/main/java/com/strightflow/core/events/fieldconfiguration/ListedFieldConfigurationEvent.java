package com.strightflow.core.events.fieldconfiguration;

import com.strightflow.core.events.LoadedEvent;
import com.strightflow.rest.domain.FieldConfigurationInfo;

import java.util.List;

/**
 * Created by yermak on 22/5/14.
 */
public class ListedFieldConfigurationEvent extends LoadedEvent {
    private List fieldConfigurationInfos;

    public ListedFieldConfigurationEvent(List<FieldConfigurationInfo> fieldConfigurationInfos) {
        this.fieldConfigurationInfos = fieldConfigurationInfos;
    }

    public List getFieldConfigurationInfos() {
        return fieldConfigurationInfos;
    }

    public void setFieldConfigurationInfos(List fieldConfigurationInfos) {
        this.fieldConfigurationInfos = fieldConfigurationInfos;
    }
}
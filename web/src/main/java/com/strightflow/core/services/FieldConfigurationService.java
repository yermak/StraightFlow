package com.strightflow.core.services;

import com.strightflow.core.events.fieldconfiguration.ListFieldConfigurationEvent;
import com.strightflow.core.events.fieldconfiguration.ListedFieldConfigurationEvent;
import com.strightflow.core.events.fieldconfiguration.LoadFieldConfigurationEvent;
import com.strightflow.core.events.fieldconfiguration.LoadedFieldConfigurationEvent;

/**
 * Created by yermak on 22/5/14.
 */
public interface FieldConfigurationService {


    ListedFieldConfigurationEvent list(ListFieldConfigurationEvent event);

    LoadedFieldConfigurationEvent load(LoadFieldConfigurationEvent event);
}

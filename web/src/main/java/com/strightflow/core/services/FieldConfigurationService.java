package com.strightflow.core.services;

import com.strightflow.core.events.fieldconfiguration.ListFieldConfigurationEvent;
import com.strightflow.core.events.fieldconfiguration.ListedFieldConfigurationEvent;

/**
 * Created by yermak on 22/5/14.
 */
public interface FieldConfigurationService {


    ListedFieldConfigurationEvent requestAll(ListFieldConfigurationEvent listFieldConfigurationEvent);
}

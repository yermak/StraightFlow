package com.strightflow.core.services;

import com.strightflow.core.events.fieldconfiguration.*;

/**
 * Created by yermak on 22/5/14.
 */
public interface FieldConfigurationService {


    ListedFieldConfigurationEvent list(ListFieldConfigurationEvent event);

    LoadedFieldConfigurationEvent load(LoadFieldConfigurationEvent event);

    DeletedFieldConfigurationEvent delete(DeleteFieldConfigurationEvent event);
}

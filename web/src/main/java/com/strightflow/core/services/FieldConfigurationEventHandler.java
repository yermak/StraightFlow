package com.strightflow.core.services;

import com.strightflow.core.domain.FieldConfiguration;
import com.strightflow.core.events.fieldconfiguration.ListFieldConfigurationEvent;
import com.strightflow.core.events.fieldconfiguration.ListedFieldConfigurationEvent;
import com.strightflow.core.repository.FieldConfigurationRepository;
import com.strightflow.rest.domain.FieldConfigurationInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yermak on 22/5/14.
 */

@Service
public class FieldConfigurationEventHandler implements FieldConfigurationService {

    @Autowired
    private FieldConfigurationRepository repository;

    @Override
    public ListedFieldConfigurationEvent requestAll(ListFieldConfigurationEvent listFieldConfigurationEvent) {
        List<FieldConfiguration> fieldConfigurations = repository.findAll();
        List<FieldConfigurationInfo> fieldConfigurationInfos = new ArrayList<>();
        for (FieldConfiguration fieldConfiguration : fieldConfigurations) {
            FieldConfigurationInfo fieldConfigurationInfo = new FieldConfigurationInfo();
            BeanUtils.copyProperties(fieldConfiguration, fieldConfigurationInfo);
            fieldConfigurationInfo.setFields(fieldConfiguration.getFields());
            fieldConfigurationInfos.add(fieldConfigurationInfo);
        }
        return new ListedFieldConfigurationEvent(fieldConfigurationInfos);
    }
}

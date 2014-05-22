package com.strightflow.core.services;

import com.strightflow.core.repository.FieldConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yermak on 22/5/14.
 */

@Service
public class FieldConfigurationEventHandler {

    @Autowired
    private FieldConfigurationRepository repository;

}

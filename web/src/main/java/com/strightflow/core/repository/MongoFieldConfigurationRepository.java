package com.strightflow.core.repository;

import com.strightflow.core.domain.FieldConfiguration;
import com.strightflow.core.domain.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yermak on 18/5/14.
 */
@Repository
public class MongoFieldConfigurationRepository implements FieldConfigurationRepository {
    @Autowired
    private MongoTemplate template;

    @Override
    public void save(FieldConfiguration object) {
        template.save(object);
    }

    @Override
    public void delete(FieldConfiguration namespace) {
        template.remove(namespace);
    }

    @Override
    public FieldConfiguration findById(String key) {
        return template.findById(key, FieldConfiguration.class);
    }

    @Override
    public List<FieldConfiguration> findAll() {
        return template.findAll(FieldConfiguration.class);
    }
}

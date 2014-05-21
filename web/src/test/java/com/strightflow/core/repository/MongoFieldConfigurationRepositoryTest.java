package com.strightflow.core.repository;

import com.strightflow.config.MongoConfig;
import com.strightflow.core.domain.Field;
import com.strightflow.core.domain.FieldConfiguration;
import com.strightflow.core.domain.FieldType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MongoConfig.class})
public class MongoFieldConfigurationRepositoryTest {


    @Autowired
    private FieldConfigurationRepository repository;

    @Test
    public void testCreate() {
        FieldConfiguration configuration = new FieldConfiguration();
        configuration.setName("My Conf");

        Field longField = new Field();
        longField.setType(FieldType.LONG);
        longField.setName("My Long Field");
        configuration.addField(longField);

        Field doubleField = new Field();
        doubleField.setType(FieldType.DOUBLE);
        doubleField.setName("My Double Field");
        configuration.addField(doubleField);

        Field dateField = new Field();
        dateField.setType(FieldType.DATE);
        dateField.setName("My Date Field");
        configuration.addField(dateField);

        Field stringField = new Field();
        stringField.setType(FieldType.STRING);
        stringField.setName("My String Field");
        configuration.addField(stringField);

        repository.save(configuration);

    }


    @Test
    public void testFindAll(){
        List<FieldConfiguration> all = repository.findAll();
        System.out.println("all.size() = " + all.size());

    }


}
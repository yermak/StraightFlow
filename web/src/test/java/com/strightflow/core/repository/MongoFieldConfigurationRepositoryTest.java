package com.strightflow.core.repository;

import com.strightflow.config.MongoConfig;
import com.strightflow.core.domain.Field;
import com.strightflow.core.domain.FieldConfiguration;
import com.strightflow.core.domain.FieldType;
import org.bson.types.ObjectId;
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
        configuration.setDescription("12334234");

        Field longField = new Field();
        longField.setType(FieldType.LONG);
        longField.setName("My Long Field");
        longField.setDescription("Long Field Descr");
        configuration.addField(longField);

        Field doubleField = new Field();
        doubleField.setType(FieldType.DOUBLE);
        doubleField.setName("My Double Field");
        doubleField.setDescription("Double Field Descr");
        configuration.addField(doubleField);

        Field dateField = new Field();
        dateField.setType(FieldType.DATE);
        dateField.setName("My Date Field");
        dateField.setDescription("Date Field Descr");
        configuration.addField(dateField);

        Field stringField = new Field();
        stringField.setType(FieldType.STRING);
        stringField.setName("My String Field");
        stringField.setDescription("String Field Descr");
        configuration.addField(stringField);

        repository.save(configuration);

    }


    @Test
    public void testFindAll(){
        List<FieldConfiguration> all = repository.findAll();
        System.out.println("all.size() = " + all.size());

    }


}
package com.strightflow.core.repository;

import com.strightflow.config.CoreConfig;
import com.strightflow.config.MongoConfig;
import com.strightflow.core.domain.Namespace;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CoreConfig.class, MongoConfig.class})
public class MongoNamespaceRepositoryTest {


    @Autowired
    private MongoNamespaceRepository repository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreate(){
        Namespace namespace = new Namespace();
        namespace.setCode("CRM");
        namespace.setName("Customer Relationship Management");
        namespace.setDescription("Track and Monitor Customer relationship");
        repository.save(namespace);

    }
}
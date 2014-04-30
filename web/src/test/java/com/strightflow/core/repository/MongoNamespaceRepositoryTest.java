package com.strightflow.core.repository;

import com.strightflow.core.domain.Namespace;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration

public class MongoNamespaceRepositoryTest {


    @Autowired
    private MongoNamespaceRepository repository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testCreate(){
        Namespace namespace = new Namespace();
        namespace.setCode("ACT");
        namespace.setName("ACTIONS");
        namespace.setDescription("Tracking actions");
        repository.save(namespace);


    }
}
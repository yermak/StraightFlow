package com.strightflow.config;

import com.strightflow.core.repository.EntityRepository;
import com.strightflow.core.repository.NamespaceRepository;
import com.strightflow.core.services.EntityEventHandler;
import com.strightflow.core.services.EntityService;
import com.strightflow.core.services.NamespaceEventHandler;
import com.strightflow.core.services.NamespaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class CoreConfig {

    @Bean
    @Autowired
    public EntityService createEntityService(EntityRepository entityRepository) {
        return new EntityEventHandler(entityRepository);
    }

    @Bean
    @Autowired
    public NamespaceService createNamespaceService(NamespaceRepository namespaceRepository) {
        return new NamespaceEventHandler(namespaceRepository);
    }

}

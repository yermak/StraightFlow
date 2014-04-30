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

@Configuration
public class CoreConfig {

    @Bean
    public EntityService createEntityService(EntityRepository repo) {
        return new EntityEventHandler(repo);
    }

    @Bean
    @Autowired
    public NamespaceService createNamespaceService(NamespaceRepository repository) {
        return new NamespaceEventHandler(repository);
    }

}

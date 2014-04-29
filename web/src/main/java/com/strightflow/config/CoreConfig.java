package com.strightflow.config;

import com.strightflow.core.repository.EntityRepository;
import com.strightflow.core.services.EntityEventHandler;
import com.strightflow.core.services.EntityService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfig {


    @Bean
    public EntityService createService(EntityRepository repo) {
        return new EntityEventHandler(repo);
    }

}

package com.strightflow.config;

import com.mongodb.Mongo;
import com.strightflow.core.repository.MongoNamespaceRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by yermak on 29/4/14.
 */
@Configuration
@EnableMongoRepositories
@ComponentScan(basePackages="com.strightflow.core.repository")
//@PropertySource("classpath:application.properties")

public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "strightflow";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }

    @Override
    protected String getMappingBasePackage() {
        return "com.strightflow.core.domain";
    }



}

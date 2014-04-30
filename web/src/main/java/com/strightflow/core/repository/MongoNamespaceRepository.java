package com.strightflow.core.repository;

import com.strightflow.core.domain.Namespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */

@Repository
public class MongoNamespaceRepository implements NamespaceRepository{


    @Autowired
    private MongoTemplate template;

    @Override
    public void save(Namespace object) {
        template.save(object);
    }

    @Override
    public void delete(Namespace namespace) {
        template.remove(namespace);
    }

    @Override
    public Namespace findById(String key) {
        return template.findById(key, Namespace.class);
    }

    @Override
    public List<Namespace> findAll() {
        return template.findAll(Namespace.class);
    }
}

package com.strightflow.core.repository;

import com.strightflow.core.domain.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */
@Repository
public class MongoEntityRepository implements EntityRepository {


    @Autowired
    private MongoTemplate template;

    @Override
    public void save(Entity object) {
        template.save(object);
    }

    @Override
    public void delete(Entity entity) {
        template.remove(entity);
    }

    @Override
    public Entity findById(String key) {
        return template.findById(key, Entity.class);
    }

    @Override
    public List<Entity> findAll() {
        return template.findAll(Entity.class);
    }
}

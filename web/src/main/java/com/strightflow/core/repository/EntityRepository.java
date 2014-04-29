package com.strightflow.core.repository;

import com.strightflow.core.domain.Entity;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */
public interface EntityRepository {
    Entity save(Entity entity);

    void delete(String key);

    Entity findById(String key);

    List<Entity> findAll();

}

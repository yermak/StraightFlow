package com.strightflow.core.repository;

import com.strightflow.core.domain.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yermak on 29/4/14.
 */
public interface MongoEntityRepository extends EntityRepository, MongoRepository<Entity, String> {

}

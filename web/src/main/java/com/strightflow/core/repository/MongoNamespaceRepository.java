package com.strightflow.core.repository;

import com.strightflow.core.domain.Namespace;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yermak on 29/4/14.
 */

public interface MongoNamespaceRepository extends NamespaceRepository, MongoRepository<Namespace,String> {
}

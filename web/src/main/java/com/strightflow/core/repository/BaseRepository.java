package com.strightflow.core.repository;

import com.strightflow.core.domain.Entity;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */

public interface BaseRepository<T> {

    T save(T object);

    void delete(String key);

    T findById(String key);

    List<T> findAll();
}

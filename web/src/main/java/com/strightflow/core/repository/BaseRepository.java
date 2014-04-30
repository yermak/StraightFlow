package com.strightflow.core.repository;

import java.util.List;

/**
 * Created by yermak on 29/4/14.
 */

public interface BaseRepository<T> {

    void save(T object);

    void delete(T object);

    T findById(String key);

    List<T> findAll();
}

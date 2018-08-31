package com.codegym.repository;

import java.util.List;

public interface Repository<V> {
    List<V> findAll();

    V findById(Long id);

    void save(V model);

    void remove(Long id);
}

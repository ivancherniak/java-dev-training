package org.ivch.dao;

import java.util.List;
import java.util.Optional;

public interface ModelDao<T> {
    List<T> getAll();

    Optional<T> getById(int id);
}

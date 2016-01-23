package jt.library.model.dao;

import jt.library.model.entity.Persisten;

import java.util.List;

/**
 * Created by sergey on 17.01.16.
 */
public interface Dao<T extends Persisten> {
    void saveOrUpdate(T persistent);

    void delete(Long id);

    void delete(T persistent);

    T get(Long id);

    List<T> getAll();
}

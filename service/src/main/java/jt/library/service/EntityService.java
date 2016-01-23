package jt.library.service;

import jt.library.model.entity.Author;

import java.util.List;

/**
 * Created by sergey on 17.01.16.
 */
public interface EntityService<T extends Author> {
    void saveOrUpdate(T persistent);

    void delete(Long id);

    void delete(T persistent);

    T get(Long id);

    List<T> getAll();
}

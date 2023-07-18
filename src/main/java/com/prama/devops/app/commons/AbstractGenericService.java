package com.prama.devops.app.commons;

import java.util.stream.Stream;

public abstract class AbstractGenericService<T> implements GenericService<T>{
    protected abstract GenericRepository<T> getRepository();

    @Override
    public T save(T t) {
        return getRepository().save(t);
    }

    @Override
    public void update(T t) {
        getRepository().update(t);
    }

    @Override
    public void delete(String id) {
        getRepository().delete(id);
    }

    @Override
    public T get(String id) {
        return getRepository().get(id);
    }

    @Override
    public Stream<T> getAll() {
        return getRepository().getAll();
    }
}

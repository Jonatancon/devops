package com.prama.devops.app.commons;

import java.util.stream.Stream;

public interface GenericRepository <T>{

    T save(T t);
    void update(T t);
    void delete(String id);
    T get(String id);
    Stream<T> getAll();
}

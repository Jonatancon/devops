package com.prama.devops.app.user.domain.service;

import com.prama.devops.app.commons.AbstractGenericService;
import com.prama.devops.app.commons.GenericRepository;
import com.prama.devops.app.user.domain.model.User;
import com.prama.devops.app.user.domain.repository.UserRepository;

public class UserService extends AbstractGenericService<User> {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    protected GenericRepository<User> getRepository() {
        return this.repository;
    }
}

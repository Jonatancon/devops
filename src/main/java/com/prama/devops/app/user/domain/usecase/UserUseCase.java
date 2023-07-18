package com.prama.devops.app.user.domain.usecase;

import com.prama.devops.app.user.domain.model.User;
import com.prama.devops.app.user.domain.service.UserService;

import java.util.stream.Stream;

public class UserUseCase {
    private final UserService service;

    public UserUseCase(UserService service) {
        this.service = service;
    }

    public User saveUser(User user) {
        return service.save(user);
    }

    public void updateUser(User user) {
        service.update(user);
    }

    public void deleteUser(String id) {
        service.delete(id);
    }

    public User getUser(String id) {
        return service.get(id);
    }

    public Stream<User> getAllUser() {
        return service.getAll();
    }
}

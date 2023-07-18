package com.prama.devops.app.user.aplication.handler;

import com.prama.devops.app.user.aplication.dto.GenericResponse;
import com.prama.devops.app.user.domain.model.User;
import com.prama.devops.app.user.domain.usecase.UserUseCase;
import com.prama.devops.app.user.infraestructure.message.Messages;
import org.springframework.http.HttpStatus;

import java.util.stream.Collectors;

public class UserHandler {
    private final UserUseCase useCase;
    private final Messages messages;

    public UserHandler(UserUseCase useCase, Messages messages) {
        this.useCase = useCase;
        this.messages = messages;
    }

    public GenericResponse<User> saveUser(User user) {
        GenericResponse<User> response = GenericResponse.success();
        response.getData().add(useCase.saveUser(user));
        response.setStatus(HttpStatus.CREATED.value());
        response.setDescription(messages.getSuccess());

        return response;
    }

    public GenericResponse<User> updateUser(User user) {
        GenericResponse<User> response = GenericResponse.success();
        useCase.updateUser(user);

        response.setStatus(HttpStatus.OK.value());
        response.setDescription(messages.getSuccess());

        return response;
    }

    public GenericResponse<User> deleteUser(String id) {
        GenericResponse<User> response = GenericResponse.success();
        useCase.deleteUser(id);

        response.setStatus(HttpStatus.OK.value());
        response.setDescription(messages.getSuccess());

        return response;
    }

    public GenericResponse<User> getUser(String id) {
        GenericResponse<User> response = GenericResponse.success();
        response.getData().add(useCase.getUser(id));
        response.setStatus(HttpStatus.OK.value());
        response.setDescription(messages.getSuccess());

        return response;
    }

    public GenericResponse<User> getAllUser() {
        GenericResponse<User> response = GenericResponse.success();
        response.setData(useCase.getAllUser().collect(Collectors.toList()));
        response.setStatus(HttpStatus.OK.value());
        response.setDescription(messages.getSuccess());

        return response;
    }
}

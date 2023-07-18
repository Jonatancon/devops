package com.prama.devops.app.user.infraestructure.controller;

import com.prama.devops.app.user.aplication.dto.GenericResponse;
import com.prama.devops.app.user.aplication.handler.UserHandler;
import com.prama.devops.app.user.domain.model.User;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Log4j
public class UserController {
    private final UserHandler handler;

    public UserController(UserHandler handler) {
        this.handler = handler;
    }

    @GetMapping("/{identification}")
    public ResponseEntity<GenericResponse<User>> getUserById(@PathVariable(name = "identification") String identification) {
        GenericResponse<User> response = handler.getUser(identification);
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatus()));
    }

    @GetMapping
    public ResponseEntity<GenericResponse<User>> getAllUser() {
        GenericResponse<User> response = handler.getAllUser();
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatus()));
    }

    @PostMapping
    public ResponseEntity<GenericResponse<User>> saveUser(@RequestBody User user) {
        GenericResponse<User> response = handler.saveUser(user);
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatus()));
    }

    @PutMapping
    public ResponseEntity<GenericResponse<User>> updateUser(@RequestBody User user) {
        GenericResponse<User> response = handler.updateUser(user);
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatus()));
    }

    @DeleteMapping
    public ResponseEntity<GenericResponse<User>> deleteUser(@RequestParam(name = "identification") String identification) {
        GenericResponse<User> response = handler.deleteUser(identification);
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getStatus()));
    }
}

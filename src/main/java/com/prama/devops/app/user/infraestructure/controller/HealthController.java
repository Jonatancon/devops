package com.prama.devops.app.user.infraestructure.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
@Log4j
public class HealthController {

    @GetMapping
    public HttpEntity<?> ok() {
        return  ResponseEntity.accepted().build();
    }
}

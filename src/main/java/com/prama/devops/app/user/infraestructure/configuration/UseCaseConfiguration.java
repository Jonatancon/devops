package com.prama.devops.app.user.infraestructure.configuration;

import com.prama.devops.app.user.domain.service.UserService;
import com.prama.devops.app.user.domain.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public UserUseCase getUserUseCase(UserService service) {
        return new UserUseCase(service);
    }
}

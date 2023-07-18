package com.prama.devops.app.user.infraestructure.configuration;

import com.prama.devops.app.user.domain.repository.UserRepository;
import com.prama.devops.app.user.domain.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class ServiceConfiguration {

    @Bean
    public UserService getUserService(UserRepository repository) {
        return new UserService(repository);
    }
}

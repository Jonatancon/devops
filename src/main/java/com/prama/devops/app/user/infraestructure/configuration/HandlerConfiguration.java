package com.prama.devops.app.user.infraestructure.configuration;

import com.prama.devops.app.user.aplication.handler.UserHandler;
import com.prama.devops.app.user.domain.usecase.UserUseCase;
import com.prama.devops.app.user.infraestructure.message.Messages;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HandlerConfiguration {

    @Bean
    public UserHandler getUserHandler(UserUseCase useCase, Messages messages){
        return new UserHandler(useCase, messages);
    }
}

package com.prama.devops.app.user.infraestructure.configuration;

import com.prama.devops.app.user.infraestructure.message.Messages;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public Messages getMessage(MessageSource messageSource) {
        return new Messages(messageSource);
    }
}

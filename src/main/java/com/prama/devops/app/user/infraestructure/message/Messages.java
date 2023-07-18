package com.prama.devops.app.user.infraestructure.message;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class Messages {
    private final MessageSource messageSource;

    public Messages(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public  String getSuccess(){
        return messageSource.getMessage("description.generic.success", null, Locale.getDefault());
    }

}

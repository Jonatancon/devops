package com.prama.devops.app.user.data;

import com.prama.devops.app.user.domain.model.User;

public class DataMock {

    public static User getUser(){
        return new User("123", "pepito", "perez", "M");
    }
}

package com.prama.devops.app.user.domain.model;

public class User {

    private String identification;
    private String name;
    private String lastName;
    private String sex;

    public User(String identification, String name, String lastName, String sex) {
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public User() {
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

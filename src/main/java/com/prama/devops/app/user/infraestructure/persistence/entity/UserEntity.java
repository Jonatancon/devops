package com.prama.devops.app.user.infraestructure.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String identification;
    private String name;
    private String lastName;
    private String sex;

    public UserEntity(Long id, String identification, String name, String lastName, String sex) {
        this.id = id;
        this.identification = identification;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
    }

    public UserEntity(){}

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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

package com.prama.devops.app.user.infraestructure.persistence.entity;

import com.prama.devops.app.user.domain.model.User;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public UserEntity(Long id, String identification, String name, String lastName, String sex) {
        super(identification, name, lastName, sex);
        this.id = id;
    }

    public UserEntity(){}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

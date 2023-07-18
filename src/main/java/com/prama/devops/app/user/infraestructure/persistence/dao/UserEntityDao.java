package com.prama.devops.app.user.infraestructure.persistence.dao;

import com.prama.devops.app.user.infraestructure.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityDao extends JpaRepository<UserEntity,Long> {

    void deleteByIdentification(String id);

    Optional<UserEntity> findByIdentification(String id);
}

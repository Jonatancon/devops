package com.prama.devops.app.user.infraestructure.persistence.builder;

import com.prama.devops.app.user.domain.model.User;
import com.prama.devops.app.user.infraestructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.stream.Stream;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userEntityToUser(UserEntity entity);
    Stream<User> userEntitiesToUsers(Stream<UserEntity> userEntityStream);

    @Mapping(target = "id", ignore = true)
    UserEntity userToUserEntity(User user);
}

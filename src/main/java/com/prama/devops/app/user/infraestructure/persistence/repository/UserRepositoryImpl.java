package com.prama.devops.app.user.infraestructure.persistence.repository;

import com.prama.devops.app.user.domain.model.User;
import com.prama.devops.app.user.domain.repository.UserRepository;
import com.prama.devops.app.user.infraestructure.persistence.builder.UserMapper;
import com.prama.devops.app.user.infraestructure.persistence.dao.UserEntityDao;
import org.springframework.stereotype.Repository;
import java.util.stream.Stream;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private final UserEntityDao dao;

    private final UserMapper mapper;

    public UserRepositoryImpl(UserEntityDao dao, UserMapper mapper) {
        this.dao = dao;
        this.mapper = mapper;
    }

    @Override
    public User save(User user) {
        return mapper.userEntityToUser(
                dao.save(
                        mapper.userToUserEntity(user)
                )
        );
    }

    @Override
    public void update(User user) {
        dao.save(
                mapper.userToUserEntity(user)
        );
    }

    @Override
    public void delete(String id) {
        dao.deleteByIdentification(id);
    }

    @Override
    public User get(String id) {
        return dao.findByIdentification(id).map(mapper::userEntityToUser).orElse(null);
    }

    @Override
    public Stream<User> getAll() {
        return  mapper.userEntitiesToUsers(dao.findAll().stream());
    }
}

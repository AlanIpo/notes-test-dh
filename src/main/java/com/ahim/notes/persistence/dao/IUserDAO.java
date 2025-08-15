package com.ahim.notes.persistence.dao;

import com.ahim.notes.persistence.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {

    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    void save(UserEntity user);

    void deleteById(Long id);

}

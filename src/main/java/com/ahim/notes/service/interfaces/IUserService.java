package com.ahim.notes.service.interfaces;

import com.ahim.notes.persistence.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {

    List<UserEntity> findAll();

    Optional<UserEntity> findById(Long id);

    void save(UserEntity user);

    void delete(Long id);

}

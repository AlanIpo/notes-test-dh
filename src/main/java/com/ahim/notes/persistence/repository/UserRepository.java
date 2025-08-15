package com.ahim.notes.persistence.repository;

import com.ahim.notes.persistence.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
}

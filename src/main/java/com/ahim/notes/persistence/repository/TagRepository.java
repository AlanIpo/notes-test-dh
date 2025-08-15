package com.ahim.notes.persistence.repository;

import com.ahim.notes.persistence.entity.TagEntity;
import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<TagEntity, Long> {
}

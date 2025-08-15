package com.ahim.notes.service.interfaces;

import com.ahim.notes.persistence.entity.TagEntity;

import java.util.List;
import java.util.Optional;

public interface ITagService {

    List<TagEntity> findAll();

    Optional<TagEntity> findById(Long id);

    void save(TagEntity tag);

    void delete(Long id);

}

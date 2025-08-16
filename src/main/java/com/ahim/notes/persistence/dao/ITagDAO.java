package com.ahim.notes.persistence.dao;

import com.ahim.notes.persistence.entity.TagEntity;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ITagDAO {

    List<TagEntity> findAll();

    Optional<TagEntity> findById(Long id);

    void save(TagEntity tag);

    void deleteById(Long id);

    //List<TagEntity> findTagsByUserId(@Param("userId") Long userId);

}

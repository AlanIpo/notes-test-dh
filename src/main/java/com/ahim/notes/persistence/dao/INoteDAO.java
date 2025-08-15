package com.ahim.notes.persistence.dao;

import com.ahim.notes.persistence.entity.NoteEntity;

import java.util.List;
import java.util.Optional;

public interface INoteDAO {

    List<NoteEntity> findAll();

    Optional<NoteEntity> findById(Long id);

    void save(NoteEntity note);

    void deleteById(Long id);

}

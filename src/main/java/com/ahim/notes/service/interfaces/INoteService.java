package com.ahim.notes.service.interfaces;

import com.ahim.notes.persistence.entity.NoteEntity;

import java.util.List;
import java.util.Optional;

public interface INoteService {

    List<NoteEntity> findAll();

    Optional<NoteEntity> findById(Long id);

    void save(NoteEntity note);

    void delete(Long id);

}

package com.ahim.notes.service.interfaces;

import com.ahim.notes.persistence.entity.NoteEntity;

import java.util.List;
import java.util.Optional;

public interface INoteService {

    List<NoteEntity> findAll();

    Optional<NoteEntity> findById(Long id);

    void save(NoteEntity note);

    void deleteById(Long id);

    List<NoteEntity> findAllByUserIdOrderByTitleAsc(Long userId);
    List<NoteEntity> findAllByUserIdOrderByTitleDesc(Long userId);

    List<NoteEntity> findAllByUserIdOrderByCreatedAtAsc(Long userId);
    List<NoteEntity> findAllByUserIdOrderByCreatedAtDesc(Long userId);

    List<NoteEntity> findAllByUserIdOrderByUpdatedAtAsc(Long userId);
    List<NoteEntity> findAllByUserIdOrderByUpdatedAtDesc(Long userId);

}

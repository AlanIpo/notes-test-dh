package com.ahim.notes.persistence.repository;

import com.ahim.notes.persistence.entity.NoteEntity;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<NoteEntity, Long> {
}

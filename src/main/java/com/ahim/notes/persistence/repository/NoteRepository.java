package com.ahim.notes.persistence.repository;

import com.ahim.notes.persistence.entity.NoteEntity;
import com.ahim.notes.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long> {

    List<NoteEntity> findAllByUserIdOrderByTitleAsc(Long userId);
    List<NoteEntity> findAllByUserIdOrderByTitleDesc(Long userId);

    List<NoteEntity> findAllByUserIdOrderByCreatedAtAsc(Long userId);
    List<NoteEntity> findAllByUserIdOrderByCreatedAtDesc(Long userId);

    List<NoteEntity> findAllByUserIdOrderByUpdatedAtAsc(Long userId);
    List<NoteEntity> findAllByUserIdOrderByUpdatedAtDesc(Long userId);

}

package com.ahim.notes.persistence.dao.implementation;

import com.ahim.notes.persistence.dao.INoteDAO;
import com.ahim.notes.persistence.entity.NoteEntity;
import com.ahim.notes.persistence.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class NoteDAOImpl implements INoteDAO {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public List<NoteEntity> findAll() {
        return (List<NoteEntity>) noteRepository.findAll();
    }

    @Override
    public Optional<NoteEntity> findById(Long id) {
        return noteRepository.findById(id);
    }

    @Override
    public void save(NoteEntity note) {
        noteRepository.save(note);
    }

    @Override
    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByTitleAsc(Long userId) {
        return noteRepository.findAllByUserIdOrderByTitleAsc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByTitleDesc(Long userId) {
        return noteRepository.findAllByUserIdOrderByTitleDesc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByCreatedAtAsc(Long userId) {
        return noteRepository.findAllByUserIdOrderByCreatedAtAsc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByCreatedAtDesc(Long userId) {
        return noteRepository.findAllByUserIdOrderByCreatedAtDesc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByUpdatedAtAsc(Long userId) {
        return noteRepository.findAllByUserIdOrderByUpdatedAtAsc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByUpdatedAtDesc(Long userId) {
        return noteRepository.findAllByUserIdOrderByUpdatedAtDesc(userId);
    }

}

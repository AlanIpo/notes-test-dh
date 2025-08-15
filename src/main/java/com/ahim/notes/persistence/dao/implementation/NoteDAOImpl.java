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
}

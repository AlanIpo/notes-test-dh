package com.ahim.notes.service.implementation;

import com.ahim.notes.persistence.dao.INoteDAO;
import com.ahim.notes.persistence.entity.NoteEntity;
import com.ahim.notes.service.interfaces.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteServiceImpl implements INoteService {

    @Autowired
    private INoteDAO noteDAO;

    @Override
    public List<NoteEntity> findAll() {
        return noteDAO.findAll();
    }

    @Override
    public Optional<NoteEntity> findById(Long id) {
        return noteDAO.findById(id);
    }

    @Override
    public void save(NoteEntity note) {
        noteDAO.save(note);
    }

    @Override
    public void delete(Long id) {
        noteDAO.deleteById(id);
    }
}

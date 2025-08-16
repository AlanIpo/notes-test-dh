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
    public void deleteById(Long id) {
        noteDAO.deleteById(id);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByTitleAsc(Long userId) {
        return noteDAO.findAllByUserIdOrderByTitleAsc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByTitleDesc(Long userId) {
        return noteDAO.findAllByUserIdOrderByTitleDesc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByCreatedAtAsc(Long userId) {
        return noteDAO.findAllByUserIdOrderByCreatedAtAsc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByCreatedAtDesc(Long userId) {
        return noteDAO.findAllByUserIdOrderByCreatedAtDesc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByUpdatedAtAsc(Long userId) {
        return noteDAO.findAllByUserIdOrderByUpdatedAtAsc(userId);
    }

    @Override
    public List<NoteEntity> findAllByUserIdOrderByUpdatedAtDesc(Long userId) {
        return noteDAO.findAllByUserIdOrderByUpdatedAtDesc(userId);
    }
}

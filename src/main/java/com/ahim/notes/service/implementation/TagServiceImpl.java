package com.ahim.notes.service.implementation;

import com.ahim.notes.persistence.dao.ITagDAO;
import com.ahim.notes.persistence.entity.TagEntity;
import com.ahim.notes.service.interfaces.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TagServiceImpl implements ITagService {

    @Autowired
    private ITagDAO tagDAO;

    @Override
    public List<TagEntity> findAll() {
        return tagDAO.findAll();
    }

    @Override
    public Optional<TagEntity> findById(Long id) {
        return tagDAO.findById(id);
    }

    @Override
    public void save(TagEntity tag) {
        tagDAO.save(tag);
    }

    @Override
    public void delete(Long id) {
        tagDAO.deleteById(id);
    }

    /*@Override
    public List<TagEntity> findTagsByUserId(Long userId) {
        return tagDAO.findTagsByUserId(userId);
    }*/
}

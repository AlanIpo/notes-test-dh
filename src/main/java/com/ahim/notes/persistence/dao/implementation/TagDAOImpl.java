package com.ahim.notes.persistence.dao.implementation;

import com.ahim.notes.persistence.dao.ITagDAO;
import com.ahim.notes.persistence.entity.TagEntity;
import com.ahim.notes.persistence.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TagDAOImpl implements ITagDAO {

    @Autowired
    private TagRepository tagRepository;

    @Override
    public List<TagEntity> findAll() {
        return (List<TagEntity>) tagRepository.findAll();
    }

    @Override
    public Optional<TagEntity> findById(Long id) {
        return tagRepository.findById(id);
    }

    @Override
    public void save(TagEntity tag) {
        tagRepository.save(tag);
    }

    @Override
    public void deleteById(Long id) {
        tagRepository.deleteById(id);
    }

    /*@Override
    public List<TagEntity> findTagsByUserId(Long userId) {
        return tagRepository.findTagsByUserId(userId);
    }*/
}

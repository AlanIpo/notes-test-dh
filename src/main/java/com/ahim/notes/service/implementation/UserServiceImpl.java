package com.ahim.notes.service.implementation;

import com.ahim.notes.persistence.dao.IUserDAO;
import com.ahim.notes.persistence.entity.UserEntity;
import com.ahim.notes.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDAO userDAO;

    @Override
    public List<UserEntity> findAll() {
        return userDAO.findAll();
    }

    @Override
    public Optional<UserEntity> findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public void save(UserEntity user) {
        userDAO.save(user);
    }

    @Override
    public void delete(Long id) {
        userDAO.deleteById(id);
    }
}

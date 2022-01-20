package com.codegym.validateform.service;

import com.codegym.validateform.model.User;
import com.codegym.validateform.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    IUserRepo userRepo;

    @Override
    public void save(User user) {
        userRepo.save(user);
    }
}

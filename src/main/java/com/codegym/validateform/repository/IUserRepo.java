package com.codegym.validateform.repository;

import com.codegym.validateform.model.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepo extends CrudRepository<User,Integer> {
}

package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);

    List<User> findAllUsers();

    User updateUser(User user);
    void deleteUser(int id);
    User findByEmail(String email);


}

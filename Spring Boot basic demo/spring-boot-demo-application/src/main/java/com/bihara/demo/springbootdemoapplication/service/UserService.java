package com.bihara.demo.springbootdemoapplication.service;

import com.bihara.demo.springbootdemoapplication.model.User;

public interface UserService {

    User save(User user);

    User fetchUserById(int id);
}

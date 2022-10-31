package com.bihara.demo.springbootdemoapplication.repository;

import com.bihara.demo.springbootdemoapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends JpaRepository<User,Integer> {

    //User save(User user); // if extents from Repository.. we need this
}

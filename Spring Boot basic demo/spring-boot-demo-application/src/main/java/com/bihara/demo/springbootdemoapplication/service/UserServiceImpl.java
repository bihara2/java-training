package com.bihara.demo.springbootdemoapplication.service;

import com.bihara.demo.springbootdemoapplication.model.User;
import com.bihara.demo.springbootdemoapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    public User save(User user){
        return  userRepository.save(user);
    }

    public User fetchUserById(int id){
        Optional<User> user=userRepository.findById(id);

        if(user.isPresent()){
            return user.get();
        }else {
            return null;
        }
    }
}

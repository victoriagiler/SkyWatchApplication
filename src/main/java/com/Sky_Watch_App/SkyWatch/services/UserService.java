package com.Sky_Watch_App.SkyWatch.services;


import com.Sky_Watch_App.SkyWatch.entities.User;
import com.Sky_Watch_App.SkyWatch.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //Get Requests

    public Iterable<User> getAllUsers(){
        return userRepository.findAll();
    }
    public User getUserById(Integer id){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty()){
            throw new ResponseStatusException(HttpStatusCode.valueOf(404));
        }
        return optionalUser.get();
    }


    //Post Request
    public User createNewUser(User user){
        User newUser = userRepository.save(user);
        return newUser;
    }


    //Put Request
    public User updateUser(Integer id, User updatedUser){
        User updateUser = getUserById(id);

        if(updatedUser.getEmail() != null){
            updateUser.setEmail(updatedUser.getEmail());
        }

        if(updatedUser.getPassword() != null){
            updateUser.setPassword(updatedUser.getPassword());
        }

        if(updatedUser.getUsername() != null){
            updateUser.setUsername((updatedUser.getUsername()));
        }

        if(updatedUser.getFirstName() != null){
            updateUser.setFirstName((updatedUser.getFirstName()));
        }

        if(updatedUser.getLastName() != null){
            updateUser.setLastName((updatedUser.getFirstName()));
        }

        return userRepository.save(updateUser);

    }


    //Delete Request
    public User deleteUser(Integer id){
        User userToDelete = getUserById(id);
        userRepository.delete(userToDelete);

        return userToDelete;

    }
}

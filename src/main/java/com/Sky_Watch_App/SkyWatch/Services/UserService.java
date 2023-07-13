package com.Sky_Watch_App.SkyWatch.Services;


import com.Sky_Watch_App.SkyWatch.Entities.User;
import com.Sky_Watch_App.SkyWatch.Repositories.UserRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    //Get Request
    public User getUserById(Integer id){
        Optional<User> optionalUser = userRepository.findById(id);
        if(optionalUser.isEmpty()){
            throw new ResponseStatusException(HttpStatusCode.valueOf(404));
        }
        return optionalUser.get();
    }


    //Post Request
    public User createNewUser(User user){
        return userRepository.save(user);
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

        return userRepository.save(updateUser);

    }


    //Delete Request
    public User deleteUser(Integer id){
        User userToDelete = getUserById(id);
        userRepository.delete(userToDelete);

        return userToDelete;

    }
}

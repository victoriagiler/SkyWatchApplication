package com.Sky_Watch_App.SkyWatch.Services;

import com.Sky_Watch_App.SkyWatch.Entities.User;
import com.Sky_Watch_App.SkyWatch.Repositories.UserRepository;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;

    }

    public User getUserById(Integer id){
       Optional<User> optionalUser = userRepository.findById(id);
       if(optionalUser.isEmpty()){
           throw new ResponseStatusException(HttpStatusCode.valueOf(404));
       }
       return optionalUser.get();

    }




}

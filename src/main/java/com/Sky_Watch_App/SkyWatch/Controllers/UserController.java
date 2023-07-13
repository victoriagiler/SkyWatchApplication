package com.Sky_Watch_App.SkyWatch.Controllers;


import com.Sky_Watch_App.SkyWatch.Entities.User;
import com.Sky_Watch_App.SkyWatch.Repositories.UserRepository;
import com.Sky_Watch_App.SkyWatch.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("{id}")
    public User getUserById(Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/create")
    public User createNewUser(@RequestBody User user){
        return userService.createNewUser(user);

    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User userUpdates){
      return userService.updateUser(id, userUpdates);}

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}

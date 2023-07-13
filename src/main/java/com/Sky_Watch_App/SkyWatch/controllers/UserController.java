package com.Sky_Watch_App.SkyWatch.controllers;


import com.Sky_Watch_App.SkyWatch.entities.User;
import com.Sky_Watch_App.SkyWatch.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() { return userService.getAllUsers();}

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

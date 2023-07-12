package com.Sky_Watch_App.SkyWatch.Controllers;


import com.Sky_Watch_App.SkyWatch.Entities.User;
import com.Sky_Watch_App.SkyWatch.Services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;

    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);

    }

//    @PostMapping("/create")
//    public User createUser(@RequestBody User user){
//        return userService.createUser();
//
//    }


}

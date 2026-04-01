package com.security.controller;

import com.security.dto.UserDtoRequest;
import com.security.entities.User;
import com.security.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/uus")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/show")
    public User findByEmail(@RequestParam String email) {
        return userService.findByEmail(email);
    }

    @PostMapping("/create")
    public String createUser(@RequestBody UserDtoRequest user) {
        userService.createUser(user);

        return "sucess, 200";
    }

}

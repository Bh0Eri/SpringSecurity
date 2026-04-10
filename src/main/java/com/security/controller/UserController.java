package com.security.controller;

import com.security.dto.UserDtoRequest;
import com.security.entities.UserEntity;
import com.security.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @GetMapping("/show")
    public UserEntity findByEmail(@RequestParam String email) {
        return userService.findByEmail(email);
    }

    @PostMapping("/create")
    public ResponseEntity<UserEntity> createUser(@RequestBody UserDtoRequest user) {
        return ResponseEntity.status(201).body(userService.createUser(user));
    }

}

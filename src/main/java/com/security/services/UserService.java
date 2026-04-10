package com.security.services;

import com.security.dto.UserDtoRequest;
import com.security.entities.UserEntity;
import com.security.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public UserEntity createUser(UserDtoRequest userDtoRequest) {
        UserEntity user = new UserEntity();

        user.setName(userDtoRequest.getName());
        user.setEmail(userDtoRequest.getEmail());
        user.setPassword(passwordEncoder.encode(userDtoRequest.getPassword()));
        user.setRole(userDtoRequest.getRole());
        return userRepository.save(user);
    }

}

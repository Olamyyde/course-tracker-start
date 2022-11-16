package com.manning.sbip.ch06.service;

import com.manning.sbip.ch06.model.ApplicationUser;
import com.manning.sbip.ch06.model.UserDto;
import com.manning.sbip.ch06.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public ApplicationUser createUser(UserDto userDto) {
        ApplicationUser applicationUser = new ApplicationUser();
        applicationUser.setFirstName(userDto.getFirstName());
        applicationUser.setLastName(userDto.getLastName());
        applicationUser.setEmail(userDto.getEmail());
        applicationUser.setUsername(userDto.getUsername());
        applicationUser.setPassword(passwordEncoder.encode(userDto.getPassword()));

        return userRepository.save(applicationUser);
    }

    public ApplicationUser findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}

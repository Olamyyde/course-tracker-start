package com.manning.sbip.ch06.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    @NotEmpty(message = "Enter your firstname")
    private String firstName;

    @NotEmpty(message = "Enter your lastname")
    private String lastName;

    @NotEmpty(message = "Enter your username")
    private String username;

    @NotEmpty(message = "Enter your email")
    @Email(message="Email is not valid")
    private String email;

    @NotEmpty(message = "Enter your password")
    private String password;

    @NotEmpty(message="Confirm your password")
    private String confirmPassword;
}

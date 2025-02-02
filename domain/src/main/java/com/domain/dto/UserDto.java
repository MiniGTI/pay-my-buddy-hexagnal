package com.domain.dto;

/**
 * Object to get the data input from the register form.
 * Used to parse data to register and create a new User.
 */
public record UserDto(Email email, Email emailCheck, String password, String passwordCheck, String firstName,
                      String lastName) {
}

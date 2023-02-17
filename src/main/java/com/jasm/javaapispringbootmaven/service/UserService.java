package com.jasm.javaapispringbootmaven.service;

import com.jasm.javaapispringbootmaven.model.dto.request.UserRequest;
import com.jasm.javaapispringbootmaven.model.dto.response.UserResponse;

import java.util.UUID;

public interface UserService {

    UserResponse getUserById(UUID id);
    UserResponse getUserByEmail(String email);
    UserResponse create(UserRequest user);
    UserResponse update(UserRequest user, String id);
    void deleteUser(UUID id);
}

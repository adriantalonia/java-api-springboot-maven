package com.jasm.javaapispringbootmaven.service;

import com.jasm.javaapispringbootmaven.model.dto.request.UserCreateRequest;
import com.jasm.javaapispringbootmaven.model.dto.request.UserUpdateRequest;
import com.jasm.javaapispringbootmaven.model.dto.response.UserResponse;

import java.util.UUID;

public interface UserService {

    UserResponse getUserById(UUID id);
    UserResponse getUserByEmail(String email);
    UserResponse create(UserCreateRequest user);
    UserResponse update(UserUpdateRequest user, UUID id);
    void deleteUser(UUID id);
}

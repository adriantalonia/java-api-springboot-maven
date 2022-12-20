package com.javaapispringbootmaven.service;

import com.javaapispringbootmaven.model.dto.UserRequest;
import com.javaapispringbootmaven.model.dto.UserResponse;

public interface UserService {
    UserResponse create(UserRequest user);
    UserResponse update(UserRequest user);
}

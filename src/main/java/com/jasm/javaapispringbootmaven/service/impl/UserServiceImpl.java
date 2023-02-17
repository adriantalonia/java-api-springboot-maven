package com.jasm.javaapispringbootmaven.service.impl;

import com.jasm.javaapispringbootmaven.exception.ResourceNotFoundException;
import com.jasm.javaapispringbootmaven.mapper.UserMapper;
import com.jasm.javaapispringbootmaven.model.dto.request.UserRequest;
import com.jasm.javaapispringbootmaven.model.dto.response.UserResponse;
import com.jasm.javaapispringbootmaven.repository.UserRepository;
import com.jasm.javaapispringbootmaven.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserResponse getUserById(UUID id) {
        var userDB = userRepository.findById(id).orElseThrow(() -> {
            log.info("User {} not found", id);
            return new ResourceNotFoundException("User " + id + " not found");
        });
        return UserMapper.MAPPER.toResponse(userDB);
    }

    @Override
    public UserResponse getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserResponse create(UserRequest user) {
        return null;
    }

    @Override
    public UserResponse update(UserRequest user, String id) {
        return null;
    }

    @Override
    public void deleteUser(UUID id) {

    }
}

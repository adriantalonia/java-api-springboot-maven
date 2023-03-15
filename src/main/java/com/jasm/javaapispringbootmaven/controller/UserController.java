package com.jasm.javaapispringbootmaven.controller;

import com.jasm.javaapispringbootmaven.model.dto.request.UserCreateRequest;
import com.jasm.javaapispringbootmaven.model.dto.request.UserUpdateRequest;
import com.jasm.javaapispringbootmaven.model.dto.response.UserResponse;
import com.jasm.javaapispringbootmaven.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable String id) {
        System.out.println("id: "+id);
        return ResponseEntity.ok(id);
    }

    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<UserResponse> createUser(@Valid @RequestBody UserCreateRequest user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.create(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> updateUser(@Valid @RequestBody UserUpdateRequest user, @PathVariable UUID id) {
        return ResponseEntity.status(HttpStatus.OK).body(userService.update(user, id));
    }

}

package com.javaapispringbootmaven.model.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserRequest {
    @NotNull(message = "First name cannot be null")
    @Size(min = 4, message = "Firstname must not be less than two characters")
    private String firstName;
    @NotNull(message = "Last name cannot be null")
    @Size(min = 4, message = "Lastname must not be less than two characters")
    private String lastName;
}

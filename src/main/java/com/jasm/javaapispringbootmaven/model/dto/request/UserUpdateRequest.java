package com.jasm.javaapispringbootmaven.model.dto.request;

import com.jasm.javaapispringbootmaven.model.entity.Role;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserUpdateRequest {

    @NotBlank(message = "First name cannot be blank")
    @Size(min = 4, message = "Firstname must not be less than 2 characters")
    private String firstName;
    @NotBlank(message = "Last name cannot be blank")
    @Size(min = 4, message = "Firstname must not be less than 2 characters")
    private String lastName;
    @Pattern(regexp="(^$|[0-9]{10})", message = "Phone must be only numbers and has 10 digits")
    private String phone;
    @NotNull(message = "The user must have a role assigned")
    private Set<Role> roles = new HashSet<>();
}

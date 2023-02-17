package com.jasm.javaapispringbootmaven.repository;

import com.jasm.javaapispringbootmaven.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}

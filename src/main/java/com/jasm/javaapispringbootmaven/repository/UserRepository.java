package com.jasm.javaapispringbootmaven.repository;

import com.jasm.javaapispringbootmaven.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}

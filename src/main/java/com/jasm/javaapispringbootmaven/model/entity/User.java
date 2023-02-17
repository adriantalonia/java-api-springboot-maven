package com.jasm.javaapispringbootmaven.model.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users", schema = "public")
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private Boolean active;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            schema = "public",
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    public void addRole(Role role) {
        this.roles.add(role);
    }
}

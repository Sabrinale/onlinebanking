package com.example.bank.service;

import com.example.bank.domain.User;
import com.example.bank.domain.security.UserRole;

import java.util.Set;

public interface UserService {
    User findByUsername(String username);
    User findByEmail(String email);

    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
    User createUser(User user, Set<UserRole> userRoles);

    void save(User user);

    User saveUser(User user);

}

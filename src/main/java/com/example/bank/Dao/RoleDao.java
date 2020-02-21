package com.example.bank.Dao;

import com.example.bank.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role, Integer> {

    Role findByName(String name);
}
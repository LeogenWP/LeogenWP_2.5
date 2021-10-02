package com.leogenWP.spring_20.repo;

import com.leogenWP.spring_20.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}

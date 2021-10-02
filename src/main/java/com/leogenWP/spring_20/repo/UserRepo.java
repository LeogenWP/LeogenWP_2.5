package com.leogenWP.spring_20.repo;

import com.leogenWP.spring_20.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUsername(String username);
}

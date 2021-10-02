package com.leogenWP.spring_20.service.impl;

import com.leogenWP.spring_20.model.Role;
import com.leogenWP.spring_20.model.User;
import com.leogenWP.spring_20.repo.RoleRepo;
import com.leogenWP.spring_20.repo.UserRepo;
import com.leogenWP.spring_20.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final RoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user to the database");
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database",role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleNAme) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleNAme);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
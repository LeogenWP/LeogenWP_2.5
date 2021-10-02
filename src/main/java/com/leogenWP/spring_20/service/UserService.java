package com.leogenWP.spring_20.service;

import com.leogenWP.spring_20.model.Role;
import com.leogenWP.spring_20.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleNAme);
    User getUser(String username);
    List<User> getUsers();
}

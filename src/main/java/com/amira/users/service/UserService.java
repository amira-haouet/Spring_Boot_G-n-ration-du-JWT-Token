package com.amira.users.service;

import com.amira.users.entities.Role;
import com.amira.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername(String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
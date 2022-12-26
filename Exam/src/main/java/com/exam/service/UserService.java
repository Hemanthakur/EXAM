package com.exam.service;

import java.util.Set;


import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {
//create User
public User createUser(User user,Set<UserRole> userRole) throws Exception;
//Get User by Username
public User getUser(String username);
//delete User by userId
public  void deleteUser(Long userId);
//Update User by userid
public User updateUser(User user,Long userId);

}

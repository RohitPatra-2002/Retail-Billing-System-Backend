package com.rohitpatra.billingsoftware.service;

import com.rohitpatra.billingsoftware.io.UserRequest;
import com.rohitpatra.billingsoftware.io.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest request);

    String getUserRole(String email);

    List<UserResponse> readUsers();

    void deleteUser(String id);
}

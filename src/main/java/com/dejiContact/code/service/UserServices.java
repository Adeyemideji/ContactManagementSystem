package com.dejiContact.code.service;

import com.dejiContact.code.dtos.request.CreateUserRequest;
import com.dejiContact.code.dtos.request.LoginUserRequest;
import com.dejiContact.code.dtos.response.CreateUserResponse;
import com.dejiContact.code.dtos.response.LoginResponse;


public interface UserServices {
    Long countNumberOfUser();
    CreateUserResponse createUser(CreateUserRequest request);

    LoginResponse isUserLoggedIn(LoginUserRequest loginRequest);
}

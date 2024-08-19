package com.dejiContact.code.dtos.request;

import lombok.Data;

@Data
public class LoginUserRequest {
    private String phoneNumber;
    private String password;
}

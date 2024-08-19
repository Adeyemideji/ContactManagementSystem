package com.dejiContact.code.Exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound(){
        super("User not found");
    }
}

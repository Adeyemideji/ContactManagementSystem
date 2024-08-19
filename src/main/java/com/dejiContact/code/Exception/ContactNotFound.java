package com.dejiContact.code.Exception;

public class ContactNotFound extends RuntimeException{
    public ContactNotFound(String message){
        super(message);
    }
}

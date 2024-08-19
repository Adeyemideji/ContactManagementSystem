package com.dejiContact.code.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class User {
    @Id
    private String Id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
}

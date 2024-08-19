package com.dejiContact.code.dtos.request;

import lombok.Data;

@Data
public class UpdateContactRequest {
    private String oldPhoneNumber;
    private String newPhoneNumber;
    private String newName;
}

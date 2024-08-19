package com.dejiContact.code.dtos.request;

import lombok.Data;

@Data
public class CreateContactRequest {
    private String name;
    private String phoneNumber;
}

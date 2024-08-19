package com.dejiContact.code.dtos.request;

import lombok.Data;

@Data
public class DeleteContactRequest {
    private String phoneNumber;
    private String name;
}

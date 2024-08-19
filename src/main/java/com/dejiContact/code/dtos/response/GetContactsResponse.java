package com.dejiContact.code.dtos.response;

import com.dejiContact.code.data.models.Contacts;
import lombok.Data;

import java.util.List;
@Data
public class GetContactsResponse {
    private List<Contacts> contacts;
    private String message;

}

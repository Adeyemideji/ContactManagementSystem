package com.dejiContact.code.service;

import com.dejiContact.code.dtos.request.CreateContactRequest;
import com.dejiContact.code.dtos.request.DeleteContactRequest;
import com.dejiContact.code.dtos.request.UpdateContactRequest;
import com.dejiContact.code.dtos.response.CreateContactResponse;
import com.dejiContact.code.dtos.response.DeleteContactResponse;
import com.dejiContact.code.dtos.response.UpdateContactResponse;

public interface ContactService {

    CreateContactResponse addContact(CreateContactRequest createContactRequest);
    DeleteContactResponse deleteContact(DeleteContactRequest deleteContactRequest);
    UpdateContactResponse updateContact(UpdateContactRequest updateContactRequest);

}

package com.dejiContact.code.controller;

import com.dejiContact.code.dtos.request.CreateContactRequest;
import com.dejiContact.code.dtos.request.DeleteContactRequest;
import com.dejiContact.code.dtos.request.UpdateContactRequest;
import com.dejiContact.code.dtos.response.CreateContactResponse;
import com.dejiContact.code.dtos.response.DeleteContactResponse;
import com.dejiContact.code.dtos.response.UpdateContactResponse;
import com.dejiContact.code.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping
    public ResponseEntity<?> addContact(@RequestBody CreateContactRequest createContactRequest){
        try{
            CreateContactResponse response = contactService.addContact(createContactRequest);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
    } catch (Exception e){
        CreateContactResponse response = new CreateContactResponse();
        response.setMessage(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping
    public ResponseEntity<?> deleteContact(@RequestBody DeleteContactRequest deleteContactRequest){
        try {
            DeleteContactResponse response = contactService.deleteContact(deleteContactRequest);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }catch (Exception e){
            DeleteContactResponse response = new DeleteContactResponse();
            response.setMessage(e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
    @PutMapping
    public ResponseEntity<?> updateContact(@RequestBody UpdateContactRequest updateContactRequest){
    try {
        UpdateContactResponse response = contactService.updateContact(updateContactRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    } catch (Exception e){
        UpdateContactResponse response = new UpdateContactResponse();
        response.setMessage(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
    }

}

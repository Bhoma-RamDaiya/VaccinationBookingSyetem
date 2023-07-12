package com.example.Vaccinationbookingapplication.Exception;

public class PersonNotFoundException  extends RuntimeException {
    public PersonNotFoundException(String message){
        super(message);
    }
}

package com.example.Vaccinationbookingapplication.Service;

import com.example.Vaccinationbookingapplication.Model.Person;
import com.example.Vaccinationbookingapplication.Repository.PersonRepository;
import com.example.Vaccinationbookingapplication.dto.request.DtoAddPersonRequest;
import com.example.Vaccinationbookingapplication.dto.response.DtoAddPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
@Autowired
    PersonRepository personRepository;
    public DtoAddPersonResponse addPerson(DtoAddPersonRequest dtoAddPersonRequest) {
        Person person = new Person();
        person.setName(dtoAddPersonRequest.getName());
        person.setAge(dtoAddPersonRequest.getAge());
        person.setEmailId(dtoAddPersonRequest.getEmailId());
        person.setGender(dtoAddPersonRequest.getGender());
        Person savedPerson = personRepository.save(person);
        DtoAddPersonResponse dtoAddPersonResponse = new DtoAddPersonResponse();
        dtoAddPersonResponse.setName(savedPerson.getName());
        dtoAddPersonResponse.setMessage("Congratulation your account has been generated");
        return dtoAddPersonResponse;



    }
}

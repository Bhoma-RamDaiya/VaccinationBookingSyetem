package com.example.Vaccinationbookingapplication.Controller;

import com.example.Vaccinationbookingapplication.Model.Person;
import com.example.Vaccinationbookingapplication.Service.PersonService;
import com.example.Vaccinationbookingapplication.dto.request.DtoAddPersonRequest;
import com.example.Vaccinationbookingapplication.dto.response.DtoAddPersonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;
//    @PostMapping("/add-person")
//    public ResponseEntity addPerson(@RequestBody Person  person){
//        try {
//            Person addedPerson = personService.addPerson(person);
//            return new ResponseEntity(addedPerson , HttpStatus.CREATED);
//        }
//        catch (Exception e){
//            return new ResponseEntity("please enter a correct Email id" , HttpStatus.BAD_REQUEST);
//        }
//    }
@PostMapping("/add-person")
public ResponseEntity addPerson(@RequestBody DtoAddPersonRequest dtoAddPersonRequest){
    try {
        DtoAddPersonResponse dtoAddPersonResponse = personService.addPerson(dtoAddPersonRequest);
        return new ResponseEntity(dtoAddPersonResponse , HttpStatus.CREATED);
    }
    catch (Exception e){
        return new ResponseEntity("please enter a correct Email id" , HttpStatus.BAD_REQUEST);
    }
}

}

package com.example.Vaccinationbookingapplication.Service;

import com.example.Vaccinationbookingapplication.Enum.DoseType;
import com.example.Vaccinationbookingapplication.Exception.Dose1AllreadyTakenException;
import com.example.Vaccinationbookingapplication.Exception.PersonNotFoundException;
import com.example.Vaccinationbookingapplication.Model.Dose;
import com.example.Vaccinationbookingapplication.Model.Person;
import com.example.Vaccinationbookingapplication.Repository.DoseRepository;
import com.example.Vaccinationbookingapplication.Repository.PersonRepository;
import com.example.Vaccinationbookingapplication.dto.request.BookDose1RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DoseService {
    @Autowired
    DoseRepository doseRepository ;
    @Autowired
    PersonRepository personRepository;
//    public Dose addDose1Take(int personId, DoseType doseType) {
//        Optional<Person> person = personRepository.findById(personId);
//        if(!person.isPresent()){
//            throw new PersonNotFoundException("Invalid person id");
//        }
//        Person person1 = person.get();
//        if(person1.isDose1Taken()){
//            throw  new Dose1AllreadyTakenException("Dose1 is Allready Taken ");
//        }
//        Dose dose = new Dose();
//        dose.setDoseId(String.valueOf(UUID.randomUUID()));
//        dose.setDoseType(doseType);
//         dose.setPerson(person1);
//
//         person1.setDose1Taken(true);
//        personRepository.save(person1);
//
//        return doseRepository.save(dose);
//    }
public Dose addDose1Take(BookDose1RequestDto bookDose1RequestDto) {
//    change dto -> to entity using getter and setters;
    Optional<Person> optionalPerson = personRepository.findById(bookDose1RequestDto.getPerson_id());
    // check whether person is present or not
    if(!optionalPerson.isPresent()){
        throw new PersonNotFoundException("Invalid person id");
    }
    // if person is present then extract person object
    Person person = optionalPerson.get();
//    check whether dose1 has already taken or not
    if(person.isDose1Taken()){
        throw  new Dose1AllreadyTakenException("Dose1 is Allready Taken ");
    }
//    create object of dose class and set the value using getters and setters
    Dose dose = new Dose();
    dose.setDoseId(String.valueOf(UUID.randomUUID()));
    dose.setDoseType(bookDose1RequestDto.getDoseType());
    dose.setPerson(person);
//set dose1Taken is true
    person.setDose1Taken(true);
    personRepository.save(person);

    return doseRepository.save(dose);
}
}

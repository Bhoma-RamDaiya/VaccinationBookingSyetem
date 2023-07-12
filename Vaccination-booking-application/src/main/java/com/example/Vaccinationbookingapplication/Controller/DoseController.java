package com.example.Vaccinationbookingapplication.Controller;

import com.example.Vaccinationbookingapplication.Model.Dose;
import com.example.Vaccinationbookingapplication.Service.DoseService;
import com.example.Vaccinationbookingapplication.dto.request.BookDose1RequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dose")
public class DoseController {
    @Autowired
    DoseService doseService;
//    @PostMapping("/dose1-taken")
//    public ResponseEntity addDose1Take(@RequestParam("id" ) int person_id , @RequestParam("DoseType")DoseType doseType){
//        try{
//            Dose dose = doseService.addDose1Take(person_id, doseType);
//            return new ResponseEntity(dose , HttpStatus.CREATED);
//        }
//        catch (Exception e){
//            return new ResponseEntity(e.getMessage() , HttpStatus.BAD_REQUEST);
//        }
//    }
@PostMapping("/dose1-taken")
public ResponseEntity addDose1Take(@RequestBody BookDose1RequestDto dtoDose1TakenRequest){
    try{
        Dose dose = doseService.addDose1Take(dtoDose1TakenRequest);
        return new ResponseEntity(dose , HttpStatus.CREATED);
    }
    catch (Exception e){
        return new ResponseEntity(e.getMessage() , HttpStatus.BAD_REQUEST);
    }
}

}

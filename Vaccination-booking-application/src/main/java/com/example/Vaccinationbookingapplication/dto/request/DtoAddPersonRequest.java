package com.example.Vaccinationbookingapplication.dto.request;

import com.example.Vaccinationbookingapplication.Enum.Gender;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoAddPersonRequest {
    String name ;
    int age ;
    String emailId;
    Gender gender;
}

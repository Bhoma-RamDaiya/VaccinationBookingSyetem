package com.example.Vaccinationbookingapplication.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DtoAddPersonResponse {
    String name ;
    String message ;
}

package com.example.Vaccinationbookingapplication.dto.request;

import com.example.Vaccinationbookingapplication.Enum.DoseType;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BookDose1RequestDto {
    int person_id ;

    DoseType doseType;

}

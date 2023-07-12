package com.example.Vaccinationbookingapplication.Model;

import com.example.Vaccinationbookingapplication.Enum.CenterType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Setter
@Getter
public class VaccinationCenter {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String centerName;

    CenterType centerType;

    String address;

}

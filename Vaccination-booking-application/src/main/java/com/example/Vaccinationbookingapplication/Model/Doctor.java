package com.example.Vaccinationbookingapplication.Model;

import com.example.Vaccinationbookingapplication.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;

    String name ;

    @Column(unique = true)
    String emailId;
    @Enumerated(EnumType.STRING)
    Gender gender;
}

package com.example.Vaccinationbookingapplication.Model;

import com.example.Vaccinationbookingapplication.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.List;


@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Person {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id ;

    String name;

    int age;

    @Column(unique = true , nullable = false)
    String emailId;

    boolean isDose1Taken;
    boolean isDose2Taken;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @OneToMany(mappedBy = "person" , cascade = CascadeType.ALL)

    List<Dose> doseTaken = new ArrayList<>();
    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    Certificate certificate;
}

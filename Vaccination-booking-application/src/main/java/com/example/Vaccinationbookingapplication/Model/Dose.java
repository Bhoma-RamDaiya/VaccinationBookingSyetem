package com.example.Vaccinationbookingapplication.Model;

import com.example.Vaccinationbookingapplication.Enum.DoseType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.boot.model.internal.XMLContext;

import java.util.Date;
import java.util.List;

@FieldDefaults(level=AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Dose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String doseId;
    @Enumerated(EnumType.STRING)
    DoseType doseType;

    @CreationTimestamp
    Date vaccinationDate;
@ManyToOne
        @JoinColumn
    Person person;


}

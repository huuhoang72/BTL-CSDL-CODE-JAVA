package com.clinicmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Patient")
@Data
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;

    private String name;
    private String idCard;
    private String birthdate;
    private String address;
    private String phoneNumber;
}

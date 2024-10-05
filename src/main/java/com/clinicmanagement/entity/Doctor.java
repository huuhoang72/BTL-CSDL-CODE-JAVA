package com.clinicmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Doctor")
@Data
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorId;

    private String name;
    private String idCard;
    private String birthdate;
    private String address;
    private String doctor_rank;
    private int experienceYears;
    private String qualification;
    private String specialization;
}

package com.clinicmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Visit")
@Data
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long visitId;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private String entryDate;
    private String exitDate;
    private String disease;
    private double treatmentCost;
}

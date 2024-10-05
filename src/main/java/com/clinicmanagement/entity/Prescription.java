package com.clinicmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Prescription")
@Data
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescriptionId;

    @ManyToOne
    @JoinColumn(name = "visit_id")
    private Visit visit;

    private String medicineName;
    private int quantity;
    private double unitPrice;
}

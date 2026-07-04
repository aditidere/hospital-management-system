package com.Hospital_Management.Hospital.entity;

import com.Hospital_Management.Hospital.entity.Doctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;
}
package com.Hospital_Management.Hospital.repository;

import com.Hospital_Management.Hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
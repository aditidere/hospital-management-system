package com.Hospital_Management.Hospital.repository;

import com.Hospital_Management.Hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  DoctorRepository extends JpaRepository<Doctor, Long> {
}

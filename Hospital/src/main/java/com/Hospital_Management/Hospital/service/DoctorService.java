package com.Hospital_Management.Hospital.service;

import com.Hospital_Management.Hospital.entity.Doctor;
import com.Hospital_Management.Hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    public List<Doctor> findAllDoctors() {
        return doctorRepository.findAll();
    }

}

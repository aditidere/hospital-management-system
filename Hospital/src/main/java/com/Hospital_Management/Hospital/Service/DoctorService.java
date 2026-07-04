package com.Hospital_Management.Hospital.Service;

import com.Hospital_Management.Hospital.entity.Doctor;
import com.Hospital_Management.Hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }
    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
    }
    public Doctor updateDoctor(Long id, Doctor doctor) {
        Doctor existing = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
        existing.setName(doctor.getName());
        existing.setSpecialization(doctor.getSpecialization());
        existing.setEmail(doctor.getEmail());
        existing.setPhone(doctor.getPhone());
        return doctorRepository.save(existing);
    }
    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}
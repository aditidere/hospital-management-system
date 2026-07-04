package com.Hospital_Management.Hospital.Service;

import com.Hospital_Management.Hospital.entity.Patient;
import com.Hospital_Management.Hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }
    public Patient findById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
    }
    public Patient update(Long id, Patient patient) {
        Patient existing = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id: " + id));
        existing.setName(patient.getName());
        existing.setEmail(patient.getEmail());
        existing.setPhone(patient.getPhone());
        existing.setAge(patient.getAge());
        return patientRepository.save(existing);
    }
    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}
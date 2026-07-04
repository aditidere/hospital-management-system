package com.Hospital_Management.Hospital.controllers;

import com.Hospital_Management.Hospital.Service.DoctorService;
import com.Hospital_Management.Hospital.entity.Doctor;
import com.Hospital_Management.Hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        return doctorService.addDoctor(doctor);
    }
    @GetMapping
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }
    @GetMapping("{id}")
    public Doctor getDoctorById(@PathVariable Integer id) {
        return doctorService.getDoctorById(Long.valueOf(id));
    }
    @PutMapping("/{id}")
    public Doctor updateDoctor(@PathVariable Integer id, @RequestBody Doctor doctor) {
        return doctorService.updateDoctor(Long.valueOf(id), doctor);
    }
    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable Integer id) {
        doctorService.deleteDoctor(Long.valueOf(id));
    }



}

package com.Hospital_Management.Hospital.Service;

import com.Hospital_Management.Hospital.entity.Appointment;
import com.Hospital_Management.Hospital.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
   public Appointment findById(Long id){
       return appointmentRepository.findById(id).get();
   }
    public List<Appointment> findAllAppointments() {
        return appointmentRepository.findAll();
    }
    public Appointment addAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }
    public void deleteAppointmentById(int id) {
        appointmentRepository.deleteById((long) id);
    }
    public Appointment updateAppointment(Appointment appointment) {
       return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAppointmentsByDoctorId(Long doctorId) {
        return appointmentRepository.findAll();
    }

    public List<Appointment> getAppointmentsByPatientId(Long patientId) {
       return appointmentRepository.findAll();
    }
}

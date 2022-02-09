package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ViewAppointment;
import com.example.demo.repository.ViewAppointmentrepository;

@Service
public class ViewAppointmentservice {
	@Autowired
	private ViewAppointmentrepository appointmentRepository;

	public void viewappointmentdetails(@Valid ViewAppointment appointment) {
		appointmentRepository.save(appointment);
		
		
	}

}


package com.example.demo.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PostAppointment;
import com.example.demo.repository.PostAppointmentrepository;

@Service

public class PostAppointmentservice {
	
	@Autowired
	private PostAppointmentrepository appointmentRepository;
	
	public void addAppointment(@Valid PostAppointment appointment) {
		appointmentRepository.save(appointment);
	}

}

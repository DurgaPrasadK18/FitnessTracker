package com.example.demo.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PostAppointment;
import com.example.demo.entity.ViewAppointment;
import com.example.demo.repository.PostAppointmentrepository;
import com.example.demo.repository.ViewAppointmentrepository;
import com.example.demo.service.PostAppointmentservice;
import com.example.demo.service.ViewAppointmentservice;

@RestController
public class ViewAppointmentcontroller {
	@Autowired
	private ViewAppointmentrepository appointmentRepository;
	
	@Autowired
	private ViewAppointmentservice appointmentService;
	@PostMapping("/viewappointment")
	@ResponseStatus(code = HttpStatus.CREATED)
	void viewappointmentdetails(@RequestBody @Valid ViewAppointment appointment) {
		appointmentService.viewappointmentdetails(appointment);
	}

}
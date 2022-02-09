package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.PostAppointment;
import com.example.demo.repository.PostAppointmentrepository;
import com.example.demo.service.PostAppointmentservice;

@RestController
public class PostAppointmentcontroller {
	
	@Autowired
	private PostAppointmentrepository appointmentRepository;
	
	@Autowired
	private PostAppointmentservice appointmentService;
	
	@PostMapping("/postappointment")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addAppointment(@RequestBody @Valid PostAppointment appointment) {
		appointmentService.addAppointment(appointment);
	}
	@GetMapping("/postappointment")
	public List<PostAppointment> getAllAppointment() {
		return appointmentRepository.findAll();
	}
	@GetMapping("/postappointment/{id}")
	public PostAppointment getAppointmentById(@PathVariable(value = "id") int id) {
		return appointmentRepository.findById(id);
	}

}
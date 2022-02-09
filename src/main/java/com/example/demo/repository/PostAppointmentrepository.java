package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PostAppointment;

@Repository
public interface PostAppointmentrepository extends CrudRepository<PostAppointment, Integer> {
	PostAppointment findById(int id);
	List<PostAppointment> findAll();
	void deleteById(int id);

}

package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ViewAppointment;

@Repository
public interface ViewAppointmentrepository extends CrudRepository<ViewAppointment, Integer> {

}
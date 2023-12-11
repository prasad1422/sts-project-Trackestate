package com.example.trackestate.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.trackestate.entity.Booking;
 @Repository
 @EnableJpaRepositories
public interface BookingRepository extends CrudRepository<Booking,Long>{

}

package com.example.trackestate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.trackestate.entity.Property;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long>{

}

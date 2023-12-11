package com.example.trackestate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.trackestate.entity.User;





@Repository
public interface UserRepository extends CrudRepository<User,Long> {

}

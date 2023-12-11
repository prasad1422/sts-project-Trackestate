package com.example.trackestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trackestate.entity.Booking;
import com.example.trackestate.repository.BookingRepository;


@Service
public class BookingService {

	
	
	
	 @Autowired
	  BookingRepository bookingRepository;
	 
	 
	public String addBooking(Booking booking_id) {
		Booking s1= bookingRepository.save(booking_id);
		
		if(s1!=null)
			return "User " + s1.getBooking_id()+ " successfully created";
		else
			return null;
	}
	
	public List<Booking> getList(){
		return (List<Booking>)bookingRepository.findAll();
	}
	

   

   public Booking getBook(Long booking_id)  {
	   Booking user=null;
   	
		user  = bookingRepository.findById(booking_id).get();
   	
		return user;
	}
   
	
	public String updateBook(Long booking_id, Booking newBooky) {
		Booking s1=bookingRepository.findById(booking_id).get();
		s1.setBuyer_name(newBooky.getBuyer_name());
		s1 = bookingRepository.save(s1);
		if(s1!=null)
			return "Booking " + s1.getBooking_id() + ", " + s1.getBuyer_name() + " successfully updated";
		else
			return null;
	}
}

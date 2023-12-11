package com.example.trackestate.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trackestate.entity.Booking;
import com.example.trackestate.service.BookingService;



@RestController
public class BookingController {

	
	
	
	@Autowired
	BookingService bookingService;	

	@PostMapping("/addBook")
	public String addBooking( @RequestBody Booking booking) {
		System.out.println("In add User:" + booking);
		return bookingService.addBooking(booking);
	}

	

	@GetMapping("/GetBook")
	public List<Booking> getList(){
		return bookingService.getList();
	}
	
	@GetMapping("/getBook/{id}")
	public Booking getBooing(@PathVariable Long booking_id) {
		
		return bookingService.getBook(booking_id);
	}

	
	
	@PutMapping("/updateBook/{id}")
	public String updateBooking(@PathVariable Long booking_id, @RequestBody Booking newBooking) {
		return bookingService.updateBook(booking_id, 	newBooking);
	}
}

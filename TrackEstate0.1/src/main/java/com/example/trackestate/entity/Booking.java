package com.example.trackestate.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Booking {
        
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long booking_id;
	
	private String book_date;
	
	private String buyer_name;

	
	@Override
	public String toString() {
		return "Booking [booking_id=" + booking_id + ", book_date=" + book_date + ", buyer_name=" + buyer_name + "]";
	}


	public Long getBooking_id() {
		return booking_id;
	}


	public void setBooking_id(Long booking_id) {
		this.booking_id = booking_id;
	}


	public String getBook_date() {
		return book_date;
	}


	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}


	public String getBuyer_name() {
		return buyer_name;
	}


	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}


	public Booking() {
		
	}
	
}

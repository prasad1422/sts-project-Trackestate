package com.example.trackestate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Property {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pro_id;
	
	
	private String pro_address;
	private String pro_owner;
	private String owner_num;
	
	@Override
	public String toString() {
		return "Property [pro_id=" + pro_id + ", pro_address=" + pro_address + ", pro_owner=" + pro_owner
				+ ", owner_num=" + owner_num + "]";
	}

	public Long getPro_id() {
		return pro_id;
	}

	public void setPro_id(Long pro_id) {
		this.pro_id = pro_id;
	}

	public String getPro_address() {
		return pro_address;
	}

	public void setPro_address(String pro_address) {
		this.pro_address = pro_address;
	}

	public String getPro_owner() {
		return pro_owner;
	}

	public void setPro_owner(String pro_owner) {
		this.pro_owner = pro_owner;
	}

	public String getOwner_num() {
		return owner_num;
	}

	public void setOwner_num(String owner_num) {
		this.owner_num = owner_num;
	}

	public Property() {
		
	}
}

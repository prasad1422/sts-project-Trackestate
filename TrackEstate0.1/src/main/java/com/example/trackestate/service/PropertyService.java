package com.example.trackestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.trackestate.entity.Property;
import com.example.trackestate.repository.PropertyRepository;

@Service
public class PropertyService {

	
	 @Autowired
	  PropertyRepository propertyRepository;
	 
	 public String addProperty(Property property) {
		 Property s1= propertyRepository.save(property);
			
			if(s1!=null)
				return "property " + s1.getPro_id()+ " successfully created";
			else
				return null;
		}
		
		public List<Property> getList(){
			return (List<Property>)propertyRepository.findAll();
		}
	
	
	
 
    

    public Property getProperty(Long pro_id)  {
    	Property user=null;
    	
		user  = propertyRepository.findById(pro_id).get();
    	
		return user;
	}
    
	
	public String updateProperty(Long pro_id, Property newProperty) {
		Property s1=propertyRepository.findById(pro_id).get();
		s1.setPro_address(newProperty.getPro_address());
		s1 = propertyRepository.save(s1);
		if(s1!=null)
			return "Property " + s1.getPro_id() + ", " + s1.getPro_address() + " successfully updated";
		else
			return null;
	}

	
}

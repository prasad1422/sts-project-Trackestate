package com.example.trackestate.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.trackestate.entity.Property;
import com.example.trackestate.service.PropertyService;


@RestController
public class PropertyController {

	
	
	
	@Autowired
	PropertyService propertyService;
	
	
	@PostMapping("/addpro")
	public String addProperty( @Validated @RequestBody Property property) {
		System.out.println("In add User:" + property);
		return propertyService.addProperty(property);
	}

	

	@GetMapping("/Getpro")
	public List<Property> getList(){
		return propertyService.getList();
	}
	
	@GetMapping("/getpro/{id}")
	public Property getproperty(@PathVariable Long pro_id) {
		
		return propertyService.getProperty(pro_id);
	}

	
	
	@PutMapping("/updatepro/{id}")
	public String updateProperty(@PathVariable Long pro_id, @RequestBody Property newProperty) {
		return propertyService.updateProperty(pro_id, 	newProperty);
	}
}

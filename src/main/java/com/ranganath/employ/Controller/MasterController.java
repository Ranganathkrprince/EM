package com.ranganath.employ.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ranganath.employ.model.EmployRequest;
import com.ranganath.employ.service.MasterService;

@RequestMapping("/api/master/")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Validated
public class MasterController {
	@Autowired
	private MasterService msterService;
	
	
	
	@PostMapping(value = "/employee/create")
	public Map<String, String> createemployee(@RequestBody EmployRequest request) {
		System.out.println("Printing>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			return msterService.createemployee(request);			
	}
	
	
	@PostMapping(value = "/employee/update")
	public Map<String, String> updateemployee(@RequestBody EmployRequest request) {
		System.out.println("Printing>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			return msterService.updateemployee(request);			
	}
	
	@PostMapping(value = "/employee/delete")
	public Map<String, String> deleteemployee(@RequestBody EmployRequest request) {
		System.out.println("Printing>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			return msterService.deleteemployee(request);			
	}

	@PostMapping(value = "/employee/get")
	public Map<String, Object> getemployee(EmployRequest request) {
			return msterService.getemployee(request);			
	}				
	
}

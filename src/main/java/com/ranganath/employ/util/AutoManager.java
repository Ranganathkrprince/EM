package com.ranganath.employ.util;

import org.springframework.beans.factory.annotation.Autowired;

import com.ranganath.employ.repository.EmployRepository;


public class AutoManager {
	@Autowired
	public EmployRepository employee;
}

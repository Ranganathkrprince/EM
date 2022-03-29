package com.ranganath.employ.service;

import java.util.Map;

import com.ranganath.employ.model.EmployRequest;

public interface MasterService {

	Map<String, String> createemployee(EmployRequest request);

	Map<String, String> updateemployee(EmployRequest request);

	Map<String, String> deleteemployee(EmployRequest request);

	Map<String, Object> getemployee(EmployRequest request);

}

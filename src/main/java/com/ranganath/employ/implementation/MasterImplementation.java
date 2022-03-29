package com.ranganath.employ.implementation;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ranganath.employ.entity.Employ;
import com.ranganath.employ.model.EmployRequest;
import com.ranganath.employ.service.MasterService;
import com.ranganath.employ.util.AutoManager;

@Service
@Transactional
public class MasterImplementation extends AutoManager implements MasterService{
	private static Logger logger = LoggerFactory.getLogger("master-log");

	@Override
	public Map<String, String> createemployee(EmployRequest request) {
		Map<String, String> info = new LinkedHashMap<>();
		try {
System.out.println("Printing>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			Date date=new Date();
			Employ doc = new Employ();
			doc.setId(null);
			doc.setExAddressLine1(request.getExAddressLine1());
			doc.setExAddressLine2(request.getExAddressLine2());
			doc.setExCity(request.getExCity());
			doc.setExCountry(request.getExCountry());
			doc.setExCreateDate(date);
			doc.setExDesignation(request.getExDesignation());
			doc.setExDOB(request.getExDOB());
			doc.setExEmail(request.getExEmail());
			doc.setExFirstName(request.getExFirstName());
			doc.setExGender(request.getExGender());
			doc.setExIsActive(true);
			doc.setExIsDelete(false);
			doc.setExLastName(request.getExLastName());
			doc.setExMobile(request.getExMobile());
			doc.setExPin(request.getExPin());
			doc.setExSalutation(request.getExSalutation());
			doc.setExState(request.getExState());
			super.employee.save(doc);
			info.put("status", "1");
			info.put("message", "Employee created successfully");
			info.put("id", "");
			return info;

		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}

	@Override
	public Map<String, String> updateemployee(EmployRequest request) {
		Map<String, String> info = new LinkedHashMap<>();
		try {
			Optional<Employ> docs = super.employee.findById(request.getId());
			if (docs.get().getId() == null || !docs.isPresent()) {
				info.put("status", "2");
				info.put("message", " employee id not present");
				return info;
			}
			Date date = new Date();
			int retval = super.employee.updateRecord(request.getId(),request.getExAddressLine1(),request.getExAddressLine2(),
					request.getExCity(),request.getExCountry(),request.getExDesignation(),request.getExDOB(),request.getExEmail(),request.getExFirstName(),
					request.getExGender(),request.getExLastName(),request.getExMobile(),request.getExPin(),request.getExSalutation(),request.getExState(),date);
			if (retval == 1) {
				info.put("status", "1");
				info.put("message", "employee updated successfully");
				return info;
			} else {
				info.put("status", "2");
				info.put("message", "employee id not present");
				return info;
			}

		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}

	@Override
	public Map<String, String> deleteemployee(EmployRequest request) {
		Map<String, String> info = new LinkedHashMap<>();
		try {
			Optional<Employ> task = super.employee.findById(request.getId());
			if (task.isPresent()) {
				int result = super.employee.deletedocument(task.get().getId());
				if (result == 0) {
					info.put("status", "2");
					info.put("message", "Something went wrong");
					return info;
				}
				info.put("status", "1");
				info.put("message", "employ deleted successfully");
				return info;
			}
			info.put("status", "2");
			info.put("message", "employ id not present");
			return info;
		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}

	@Override
	public Map<String, Object> getemployee(EmployRequest request) {
		Map<String, Object> info = new LinkedHashMap<>();
		try {
			List<Employ> tasks = super.employee.findByExIsDelete(false);
			if (tasks.size() <= 0) {
				info.put("status", "2");
				info.put("message", "Employ not created");
				return info;
			} else {
				info.put("status", "1");
				info.put("message", "success");
				info.put("details", tasks);
				return info;
			}

		} catch (Exception e) {
			logger.error("Exception occured" + e);
			StringWriter errors = new StringWriter();
			e.printStackTrace(new PrintWriter(errors));
			logger.error(errors.toString());
			info.put("status", "0");
			info.put("message", "Something went wrong");
			return info;
		}
	}
}


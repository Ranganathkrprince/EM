package com.ranganath.employ.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ranganath.employ.entity.Employ;

public interface EmployRepository extends CrudRepository< Employ, Long>{

	@Modifying
	@Transactional
	@Query(value = "UPDATE ex_employ a SET a.ex_address_line1=?2 , a.ex_address_line2=?3 , a.ex_city=?4,a.ex_country=?5,a.ex_designation=?6,a.exdob=?7,\r\n" + 
			"a.ex_email=?8, a.ex_first_name=?9 , a.ex_gender=?10,a.ex_last_name=?11 , a.ex_mobile=?12 , a.ex_pin=?13 , a.ex_salutation=?14 , a.ex_state =?15 , a.ex_update_date=?16\r\n" + 
			"WHERE a.id=?1", nativeQuery = true)
	int updateRecord(Long id, String exAddressLine1, String exAddressLine2, String exCity, String exCountry,
			String exDesignation, String exDOB, String exEmail, String exFirstName, String exGender, String exLastName,
			String exMobile, String exPin, String exSalutation, String exState,Date date);

	
	@Modifying
	@Transactional
	@Query(value = "DELETE ex_employ WHERE id=?1", nativeQuery = true)
	int deletedocument(Long id);


	List<Employ> findByExIsDelete(boolean b);



	

}

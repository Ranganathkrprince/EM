package com.ranganath.employ.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ex_employ")
public class Employ {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	private String exFirstName;
	
	private String exLastName;
	
	private String exGender;
	
	private String exDOB;
	
	private String exSalutation;
	
	private String exDesignation;
	
	private String exEmail;
	
	private String exMobile;
	
	private String exAddressLine1;
	
	private String exAddressLine2;
	
	private String exCity;
	
	private String exState;
	
	private String exPin;
	
	private String exCountry;
	
	@Column(columnDefinition="BOOLEAN DEFAULT false")
    private Boolean exIsActive;
	
	@Column(columnDefinition="BOOLEAN DEFAULT false")
	private Boolean exIsDelete;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ex_create_date", columnDefinition = "DATETIME")
	private Date exCreateDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ex_update_date", columnDefinition = "DATETIME")
	private Date exUpdateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExFirstName() {
		return exFirstName;
	}

	public void setExFirstName(String exFirstName) {
		this.exFirstName = exFirstName;
	}

	public String getExLastName() {
		return exLastName;
	}

	public void setExLastName(String exLastName) {
		this.exLastName = exLastName;
	}

	public String getExGender() {
		return exGender;
	}

	public void setExGender(String exGender) {
		this.exGender = exGender;
	}

	public String getExDOB() {
		return exDOB;
	}

	public void setExDOB(String exDOB) {
		this.exDOB = exDOB;
	}

	public String getExSalutation() {
		return exSalutation;
	}

	public void setExSalutation(String exSalutation) {
		this.exSalutation = exSalutation;
	}

	public String getExDesignation() {
		return exDesignation;
	}

	public void setExDesignation(String exDesignation) {
		this.exDesignation = exDesignation;
	}

	public String getExEmail() {
		return exEmail;
	}

	public void setExEmail(String exEmail) {
		this.exEmail = exEmail;
	}

	public String getExMobile() {
		return exMobile;
	}

	public void setExMobile(String exMobile) {
		this.exMobile = exMobile;
	}

	public String getExAddressLine1() {
		return exAddressLine1;
	}

	public void setExAddressLine1(String exAddressLine1) {
		this.exAddressLine1 = exAddressLine1;
	}

	public String getExAddressLine2() {
		return exAddressLine2;
	}

	public void setExAddressLine2(String exAddressLine2) {
		this.exAddressLine2 = exAddressLine2;
	}

	public String getExCity() {
		return exCity;
	}

	public void setExCity(String exCity) {
		this.exCity = exCity;
	}

	public String getExState() {
		return exState;
	}

	public void setExState(String exState) {
		this.exState = exState;
	}

	public String getExPin() {
		return exPin;
	}

	public void setExPin(String exPin) {
		this.exPin = exPin;
	}

	public String getExCountry() {
		return exCountry;
	}

	public void setExCountry(String exCountry) {
		this.exCountry = exCountry;
	}

	public Boolean getExIsActive() {
		return exIsActive;
	}

	public void setExIsActive(Boolean exIsActive) {
		this.exIsActive = exIsActive;
	}

	public Boolean getExIsDelete() {
		return exIsDelete;
	}

	public void setExIsDelete(Boolean exIsDelete) {
		this.exIsDelete = exIsDelete;
	}

	public Date getExCreateDate() {
		return exCreateDate;
	}

	public void setExCreateDate(Date exCreateDate) {
		this.exCreateDate = exCreateDate;
	}

	public Date getExUpdateDate() {
		return exUpdateDate;
	}

	public void setExUpdateDate(Date exUpdateDate) {
		this.exUpdateDate = exUpdateDate;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", exFirstName=" + exFirstName + ", exLastName=" + exLastName + ", exGender="
				+ exGender + ", exDOB=" + exDOB + ", exSalutation=" + exSalutation + ", exDesignation=" + exDesignation
				+ ", exEmail=" + exEmail + ", exMobile=" + exMobile + ", exAddressLine1=" + exAddressLine1
				+ ", exAddressLine2=" + exAddressLine2 + ", exCity=" + exCity + ", exState=" + exState + ", exPin="
				+ exPin + ", exCountry=" + exCountry + ", exIsActive=" + exIsActive + ", exIsDelete=" + exIsDelete
				+ ", exCreateDate=" + exCreateDate + ", exUpdateDate=" + exUpdateDate + "]";
	}

}

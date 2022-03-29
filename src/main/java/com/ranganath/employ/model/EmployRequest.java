package com.ranganath.employ.model;

public class EmployRequest {
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

		@Override
		public String toString() {
			return "EmployRequest [id=" + id + ", exFirstName=" + exFirstName + ", exLastName=" + exLastName
					+ ", exGender=" + exGender + ", exDOB=" + exDOB + ", exSalutation=" + exSalutation
					+ ", exDesignation=" + exDesignation + ", exEmail=" + exEmail + ", exMobile=" + exMobile
					+ ", exAddressLine1=" + exAddressLine1 + ", exAddressLine2=" + exAddressLine2 + ", exCity=" + exCity
					+ ", exState=" + exState + ", exPin=" + exPin + ", exCountry=" + exCountry + "]";
		}
}

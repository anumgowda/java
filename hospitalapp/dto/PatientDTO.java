package com.xworkz.hospitalapp.dto;

import com.xworkz.hospitalapp.constant.Gender;

public class PatientDTO {
	 private String patientName;
	private String address;
	private long phoneNumber;
	private String disease;
	private int age;
	 private Gender gender;
	int patientId;
	public   PatientDTO() {
	}
	public int getPatientId() {
		return patientId;
	
	}
	public void setPatientId(int patientId) {
		this.patientId=patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String PatientName) {
		this.patientName=PatientName;
		}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender Gender) {
		this.gender=Gender;
		}
	public String getaddress() {
		return address;
	}
	public void setaddress(String Address) {
		this.address=Address;
		}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long Phonenumber) {
		this.phoneNumber=Phonenumber;
		}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease=disease;
		}
	
public int getage() {
	return age;
}
public void setage(int age) {
	this.age=age;
	}

@Override
public String toString() {
	return "PatientDTO [patientName=" + patientName + ", address=" + address + ", phoneNumber=" + phoneNumber
			+ ", disease=" + disease + ", age=" + age + ", gender=" + gender + ", patientId=" + patientId + "]";
}

	
}

	


	 

	
	
	



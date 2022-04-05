package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;

public class Hospital {
	public PatientDTO patient[];
	int index;

	public Hospital(int size) {
		patient = new PatientDTO[size];

	}

	public boolean createPatientDetails(PatientDTO dto) {
		System.out.println("invoking createPatientDetails()");
		boolean patientAddeded = false;
		if (dto != null) {
			patient[index++] = dto;
			patientAddeded = true;

		} else {
			System.out.println("no patient found");

		}
		System.out.println("end of createPatientDetails");
		return patientAddeded;
	}

	public void getpatientDetails() {
		System.out.println("inside getpatientDetails()....fecting the data");
		for (int i = 0; i < patient.length; i++) {
			System.out.println(patient[i]);
		}
		System.out.println("end of getPatientDetails()");
	}

	public void getPatientByname(String name) {
		System.out.println("getpatientId() method is started");
		for (int i = 0; i < patient.length; i++) {
			if (patient[i].getPatientName() == name) {
				System.out.println(patient[i]);
			} else {
				System.out.println("no patient name match");
			}
		}

	}

	public int getPatientById(int id) {
		System.out.println("inside getPatientById()");
		System.out.println("args 1 patient Id:" + id);
		for (int i = 0; i < patient.length; i++) {
			if (patient[i].getPatientId() == id) {
				System.out.println(patient[i].getPatientId());
			} else {
				System.out.println("the given patientid is not available");

			}
		}
		return id;
	}

	
	public long getPatientPhoneno(long phoneno) {
		System.out.println("inside getPatientPhoneno()");
		for(int i=0;i<patient.length;i++) {
			if(patient[i].getPhoneNumber()==phoneno) {
				System.out.println(patient[i].getPhoneNumber());
				}
			else {
				System.out.println("the given patient phonenumber is not available");
				
			}}
		return phoneno;
	}
	public int getPatientage(int age) {
		System.out.println("inside getPatientById()");
		for(int i=0;i<patient.length;i++) {
			if(patient[i].getage()==age) {
				System.out.println(patient[i].getage());
				}
			else {
				System.out.println("the given patient age is not available");
				
			}}
		return age;
	}

	public boolean updateContactNumberByPatientName(long PhoneNumber, String patientname) {
		System.out.println("invoking update method()");
		System.out.println("ist args :phonenumber:" + PhoneNumber);
		System.out.println("1st args:patientname:" + patientname);
		boolean isContactNoUpdated = false;
		for (int i = 0; i < patient.length; i++) {
			if (patient[i].getPatientName().equals(patientname)) {
				isContactNoUpdated = true;
			} else {
				System.out.println("contact number is not updated try again...");
			}

			return isContactNoUpdated;

		}
		return false;
	}

	public String getPatientAddressByName(String pname) {
		System.out.println("inside getpatientidbyname()");
		for (int i = 0; i < patient.length; i++) {
			if (patient[i].getPatientName().equals(pname)) {
				System.out.println("patient name:"+patient[i].getPatientName()+","+"patient address:"+patient[i].getaddress());
			} else {
				System.out.println("patient name is not available");
			}
		}

			return pname;
	}
	public String getGenderByName(String pname) {
		System.out.println("inside getgenderbyname()");
		for (int i = 0; i < patient.length; i++) {
			if (patient[i].getPatientName().equals(pname)) {
				System.out.println("patient name:"+patient[i].getPatientName()+","+"patient address:"+patient[i].getgender());
			} else {
				System.out.println("patient name is not available");
			}
		}

			return pname;
	}
	
	public void gettingPatientIdByName(String name, int patientId) {
		System.out.println("invoking method()");
		System.out.println("1st args:patientname:" + name);
		System.out.println("2st args :patientid:" + patientId);
		for (int i = 0; i < patient.length; i++) {
			if (patient[i].getPatientName().equals(name)) {
				System.out.println(patient[i].getPatientName());
			} else {
				System.out.println("enter a correct Patientname..");
			}

		}

	}

}

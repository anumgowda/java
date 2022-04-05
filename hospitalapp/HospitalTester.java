package com.xworkz.hospitalapp;

import java.util.Scanner;

import com.xworkz.hospitalapp.constant.Gender;
import com.xworkz.hospitalapp.dto.PatientDTO;
import com.xworkz.hospitalapp.hospital.Hospital;

public class HospitalTester {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size");
		int size = sc.nextInt();
		Hospital hospital = new Hospital(size);

		for (int i = 0; i < size; i++) {
			PatientDTO dto = new PatientDTO();
			System.out.println("enter a id");
			dto.setPatientId(sc.nextInt());

			System.out.println("enter name");
			dto.setPatientName(sc.next());

			System.out.println("enter a address");
			dto.setaddress(sc.next());
			
			System.out.println("enter a phonenumber");
			dto.setPhoneNumber(sc.nextLong());
			
			System.out.println("enter a gender");
		String gender=	sc.next();
			dto.setGender(Gender.valueOf(gender));
			
			System.out.println("enter a disease");
			dto.setDisease(sc.next());
			
			System.out.println("enter a age");
			dto.setage(sc.nextInt());

			hospital.createPatientDetails(dto);
		}
			hospital.getPatientDetails();

			hospital.getPatientById(1);
			hospital.getPatientAddressByName("abc");
			
			System.out.println("enter name");
			hospital.getPatientByName(sc.next());
			
			System.out.println("enter age");
			hospital.getPatientage(sc.nextInt());
			
			
			System.out.println("enter id");
			hospital.deletePatientById(sc.nextInt());
			
			System.out.println("enter a deleting id");
			hospital.deletePatientById(sc.nextInt());
			
			System.out.println("enter a phonenumber");
			hospital.getPatientByPhoneno(sc.nextLong());
			
			hospital.updateContactNumberByPatientName(sc.nextLong(), sc.next());
			
			
			System.out.println("enter a patient name to get a address of patient");
			hospital.getPatientAddressByName(sc.next());
			
			System.out.println("enter a name to get a patientg gender");
			hospital.getGenderByName(sc.next());
			
			System.out.println("enter a patient name to get a patient Id");
			hospital.gettingPatientIdByName(sc.next(), sc.nextInt());
			
		}

	}



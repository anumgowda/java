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

			dto.setgender(sc.next());
			System.out.println("enter a disease");

			dto.setDisease(sc.next());
			System.out.println("enter a age");

			dto.setage(sc.nextInt());

			hospital.createPatientDetails(dto);

			hospital.getpatientDetails();

			hospital.getPatientById(1);
			
		
			

			
		}

	}

}

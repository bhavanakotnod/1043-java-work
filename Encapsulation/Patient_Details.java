
package com.Encapsulation;

public class Patient_Details {
	public static void main(String[] args) {
		Patient p = new Patient();
		 
		p.setPatient_id(897);
		p.setName("navya");
		p.setDisease("migrain");
		
		System.out.println("patient id "+ (p.getPatient_id()));
		System.out.println("patient name "+(p.getName()));
		System.out.println("Patient disease "+(p.getDisease()));
	}

}

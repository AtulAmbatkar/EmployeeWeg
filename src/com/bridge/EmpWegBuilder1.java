package com.bridge;

public class EmpWegBuilder1 {
	
public static void main(String[] args) {
		
		int IS_FULL_TIME = 1;
		
		double empCheck = Math.floor(Math.random() * 10 ) % 2 ;
		
		if(IS_FULL_TIME == empCheck)
			System.out.println("Emploee is presengt");
		else
			System.out.println("Employee is not present");
	}
}

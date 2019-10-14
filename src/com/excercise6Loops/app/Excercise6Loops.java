package com.excercise6Loops.app;

public class Excercise6Loops {

	public static void main(String[] args) {
		//c
		
		
		//Object
		
		//WERK
		for (int i=0; i<=100; i++) {
			System.out.println(i);
		}
		System.out.println("\n");
		for (int i=0; i>=100; i--) {
			System.out.println(i);
		}
		System.out.println("\n");
		for (int i=0; i<=100; i+=2) {
			System.out.println(i);
		}
		System.out.println("\n");
		System.out.println("Display off odd numbers form 100 to 200");
		for (int i=100; i<200; i++) {
			if (i%2==0) {
				continue; 
			}
			System.out.println(i);
		}
		System.out.println("Display just half of the sequence 100 to 200");
		for (int i=100; i<200; i++) {
			System.out.println(i);
			if (i==150)
			{
				break;
			}
		}
	}

}

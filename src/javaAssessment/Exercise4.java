package javaAssessment;

import java.util.Scanner;

public class Exercise4 {

	public Exercise4() {
		
	}
	public void setNumber() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Insert a number to be calculated: ");
			int number = sc.nextInt();
			
			calculate(number);
		}catch(Exception e){
	        throw new RuntimeException("Error: ", e);
		}
	}
	
	
	public void calculate(int number) {

		int sum = 0 ;
		
		for(int i = 1 ; i < number ; i ++ ) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println("Sum of multiples of 3 or 5: "+sum);
	}
}

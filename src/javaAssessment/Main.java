package javaAssessment;

import java.util.Scanner;

public class Main {
	
	static Exercise1 exercise1;
	static Exercise2 exercise2;
	static Exercise3 exercise3;
	static Exercise4 exercise4;	
	static Exercise1Result exercise1Result;
	
	public static void main(String[] args) {
		
		initiateSystem();  
		
		try (Scanner sc = new Scanner(System.in)) {
			printMenu();
			int option = sc.nextInt();
			
			switch(option) {
				case 1: exercise1Result.getExercise1Info();
					break;
				case 2: exercise2.orderNumbers();
					break;
				case 3: exercise3.calculate();
					break;
				case 4: exercise4.setNumber();
					break;
			}
			
		}catch(Exception e){
            throw new RuntimeException("Error: ", e);
		}
	}
	
	// To print the menu options
	private static void printMenu() {
		System.out.println("Please select the number of the exercise\n"
				+ "1 - Exercise 1\n"
				+ "2 - Exercise 2\n"
				+ "3 - Exercise 3\n"
				+ "4 - Exercise 4\n");
	}
	
	// Initiate this programm with some parameters
	private static void initiateSystem() {
		
		// Creating a class for exercise 1, using the same value as described in the announcement
		// (Total of voters, valid votes, blank votes, null votes) in this order
		// In order to test different values, update the values of variable 'exercise1' 
		exercise1 = new Exercise1(1000.0, 800.0, 150.0, 50.0);
		exercise1Result = new Exercise1Result(exercise1);
		
		// Creating a class for exercise 2, using the same value as described in the announcement
		// In order to test different values, update the values of variable 'v' 
		int[] v = {5,3,2,4,7,1,0,6};
		exercise2 = new Exercise2(v);
		
		// Creating a class for exercise 3, using the same value as described in the announcement
		// In order to test different values, update the values of variable 'n' 
		int n = 6;
		exercise3 = new Exercise3(n);
		
		// Creating a class for exercise 4
		exercise4 = new Exercise4();
	}
}

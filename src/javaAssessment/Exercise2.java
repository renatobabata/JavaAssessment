package javaAssessment;

public class Exercise2 {

	private int[] arrayNumber;
	
	public Exercise2 (int[] arrayNumber) {
		this.arrayNumber = arrayNumber;
	}
	
	public void orderNumbers(){
		
		int lastPosition = arrayNumber.length; // save the last position
		int aux = 0; // Auxiliary variable that is used in the logic

		// The following loops orders the numbers
		for(int i = 0 ; i < lastPosition ; i++) {
			for(int j = 0; j < lastPosition - 1 ; j ++) {
				if(arrayNumber[j] > arrayNumber[j+1]) {
					aux = arrayNumber[j];
					arrayNumber[j] = arrayNumber[j+1];
					arrayNumber[j+1] = aux;
				}
			}
		}
		
		// To print the ordered numbers
		for(int i = 0 ; i < arrayNumber.length; i++) {
			System.out.println(arrayNumber[i]);	
		}
	}
}

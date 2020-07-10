package javaAssessment;

public class Exercise3 {

	int n ; // number that is calculated
	int aux; // auxiliary variable that is used in the logic
	
	public Exercise3(int n) {
		this.n = n;
	}
	
	public void calculate(){
		aux = n - 1;
		while(aux > 0) {
			n = n * aux;
			aux--;
		}
		
		System.out.println(n);
	}
}

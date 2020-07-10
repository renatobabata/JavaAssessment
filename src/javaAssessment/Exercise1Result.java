package javaAssessment;

public class Exercise1Result {

	private Exercise1 exercise1;
	
	public Exercise1Result(Exercise1 exercise1) {
		this.exercise1 = exercise1;		
	}
	
	// Function to show the result of calculated methods
	public void getExercise1Info() {
	
		System.out.println("Percentual de votos válidos: "+validVotesPercent(exercise1.getValidVote(), exercise1.getTotalVoter()));
		System.out.println("Percentual de votos brancos: "+blankVotesPercent(exercise1.getBlankVote(), exercise1.getTotalVoter()));
		System.out.println("Percentual de votos nulos: "+nullVotesPercent(exercise1.getNullVote(), exercise1.getTotalVoter()));
		
	}
	
	// Function to calculate the percent of valid votes / total voters
	private double validVotesPercent(double validVotes, double totalVoters) {
		return (validVotes/totalVoters)*100;
	}
	
	// Function to calculate the percent of blank votes / total voters
	private double blankVotesPercent(double blankVotes, double totalVoters) {
		return (blankVotes / totalVoters)*100;
	}
	
	// Function to calculate the percent of null votes / total voters
	private double nullVotesPercent(double nullVotes, double totalVoters) {
		return (nullVotes / totalVoters)*100;
	}
}

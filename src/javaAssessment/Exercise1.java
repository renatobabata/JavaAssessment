package javaAssessment;

public class Exercise1 {

	private double totalVoter;
	private double validVote;
	private double blankVote;
	private double nullVote;
	
	public Exercise1(double totalVoter, double validVote, double blankVote, double nullVote) {
		this.totalVoter = totalVoter;
		this.validVote = validVote;
		this.blankVote = blankVote;
		this.nullVote = nullVote;
	}
	
	public double getTotalVoter() {
		return totalVoter;
	}
	public void setTotalVoter(int totalVoter) {
		this.totalVoter = totalVoter;
	}
	public double getValidVote() {
		return validVote;
	}
	public void setValidVote(int validVote) {
		this.validVote = validVote;
	}
	public double getBlankVote() {
		return blankVote;
	}
	public void setBlankVote(int blankVote) {
		this.blankVote = blankVote;
	}
	public double getNullVote() {
		return nullVote;
	}
	public void setNullVote(int nullVote) {
		this.nullVote = nullVote;
	}
	
	
}

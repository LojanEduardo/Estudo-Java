package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	
	public double sumNotes() {
		return note1 + note2 + note3;
	}
	
	public String Result(double totalNotes) {
		if(totalNotes >= 60) {
			return "PASS";
		}
		double mis = 60-totalNotes;
		return ("FAILED\n"
				+"Missing " 
				+ String.format("%.2f", mis) 
				+ " Points");
	}
	
}

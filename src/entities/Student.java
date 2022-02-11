package entities;

public class Student {
	
	private String name;
	private String email;
	public double n1;
	public double n2;
	public double n3;
	
	
	
	public Student(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public double finalGrade() {
		return n1+n2+n3;
	}
	
	public String finalResult(double finalGrade) {
		
		if (finalGrade >= 60.0) {
			return "PASS";
		}
		
		else {
			return "FAILED"+
					String.format("%n")+
					"MISSING: "+
					String.format("%.2f points", 60 - finalGrade);
		}
		
		
	}
}

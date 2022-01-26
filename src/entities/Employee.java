package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreasedSalary(double porcentage) {
		this.grossSalary += (grossSalary * (porcentage/100)) - tax;
	}
	
	public String toString() {
		return "Employee: " 
				+ name
				+ ", $ "
				+ String.format("%.2f%n%n", NetSalary());
	}
}

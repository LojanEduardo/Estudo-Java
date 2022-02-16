package entities;

public class Employee implements Comparable<Employee>{
	public String name;
	public Double grossSalary;
	public double tax;
	
	public Employee() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Employee(String name, double salary) {
		this.name = name;
		this.grossSalary = salary;
	}
	
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

	@Override
	public int compareTo(Employee o) {	
		return -grossSalary.compareTo(o.getGrossSalary());
	}
}

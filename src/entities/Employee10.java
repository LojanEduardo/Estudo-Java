package entities;

public class Employee10 {
	private int Id;
	private String Name;
	private double Salary;
	
	public Employee10() {
		
	}
	
	public Employee10(int Id ,String Name, double Salary) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
	public void aumentarSalario(double porcentagem) {
		Salary = Salary + (Salary * (porcentagem/100));
	}
	
	public String toString() {
		return Id + ", " + Name + ", " + String.format("%.2f%n%n", Salary);
	}
}

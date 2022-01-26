package entities;

public class BankAccount {
	private int Nconta;
	private String NomeTitular;
	private double ValorInicial;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int Nconta, String NomeTitular) {
		this.Nconta = Nconta;
		this.NomeTitular = NomeTitular;
		ValorInicial = 0;
	}
	
	public BankAccount(int Nconta, String NomeTitular, double ValorInicial) {
		this.Nconta = Nconta;
		this.NomeTitular = NomeTitular;
		this.ValorInicial = ValorInicial;
	}
	
	public int getNconta() {
		return Nconta;
	}
	
	public String getNomeTitular() {
		return NomeTitular;
	}
	
	public void setNomeTitular(String NomeTitular) {
		this.NomeTitular = NomeTitular;
	}
	
	public double getValor() {
		return ValorInicial;
	}
	
	public void Deposito(double deposito) {
		ValorInicial += deposito;
	}
	
	public void Saque(double saque) {
		ValorInicial -= (saque + 5 );
	}
	
	public String toString() {
		return "A conta " + getNconta() + ", do Titular: " + getNomeTitular() + ", tem " + getValor() + " em deposito.";
	}
}

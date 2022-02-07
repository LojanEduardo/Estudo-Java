package entities;

public class PessoaJ extends Contribuinte{
	
	private int funcionarios;

	public PessoaJ() {
		
	}
	
	public PessoaJ(String nome, Double rendaAnual, int funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}
	
	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public Double Imposto() {
		if(funcionarios >= 25) {
			return rendaAnual*0.14;
		}
		return rendaAnual*0.16;
	} 
	
}

package entities;

public class PessoaF extends Contribuinte{
	private Double gastoSaude;

	public PessoaF() {
		
	}
	
	public PessoaF(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double Imposto() {
		return (rendaAnual * 0.25) - (gastoSaude * 0.5);
	}
	
}

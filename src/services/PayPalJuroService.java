package services;

public class PayPalJuroService implements OnlinePaymentsService{

	@Override
	public double juro(double valor) {	
		return valor * 0.02;
	}

	@Override
	public Double interest(Double valor, Integer mounth) {
		return valor * mounth * 0.01;
	}

}

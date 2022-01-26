package exSecao05;

public class Exercicios {
	
	public String Negativo(double n1) {
		if(n1 >= 0) {
			return "POSITIVO";
		}
		return "NEGATIVO";
	}
	
	public String ImparPar(double n1) {
		if(n1%2 == 0) {
			return "PAR";
		}
		return "IMPAR";		
	}
	
	public String SaoMultiplos(double n1, double n2) {
		double maior, menor;
		
		if(n1> n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		
		if(maior%menor==0) {
			return "São Multiplos";
		}
		return "Não são Multiplos";
	}
	
	public String DuracaoJogo(double n1, double n2) {
		double tempo;
		
		if(n1 >= n2) {
			tempo = (24 - n1) + n2;
		}else {
			tempo = n2-n1;
		}
		
		return ("O JOGO DUROU " + tempo + " HORA(S)").toString();
	}
	
	public String ValorTotal(int n1, double n2) {
		
		switch (n1) {
		  case 1:
			  n2 *= 4;
		    break;
		  case 2:
			  n2 *= 4.50;
		    break;
		  case 3:
			  n2 *= 5;
		    break;
		  case 4:
			  n2 *= 2;
			break;
		  case 5:
			  n2 *= 1.50;
			break;
		  default:
		    return "Código inválido!";
		}
		return ("Total: R$ " + n2).toString();
	}
	
	public String Intervalo(double n1) {
		
		String text;
		
		if(n1 >=0 && n1 <= 25) {
			text = "[0,25]";
		}else if(n1 > 25 && n1 <= 50) {
			text = "(25,50]";
		}else if(n1 > 50 && n1 <= 75) {
			text = "(50,75]";
		}else if(n1 > 75 && n1 <= 100) {
			text = "(75,100]";
		}else {	
			return "Fora do intervalo";
		}
		
		return "Intervalo " + text;
	}
	
	
	public String Eixos(double n1, double n2) {
		
		if(n1 > 0 && n2 > 0) {
			return "Q1";
		}else if(n1 < 0 && n2 > 0) {
			return "Q2";
		}else if(n1 < 0 && n2 <0) {
			return "Q3";
		}else if(n1 > 0 && n2 < 0){
			return "Q4";
		}
		return "Origem";
	}
	
	public String CalculaImposto(double n1) {
		double n2 = 0;
		
		if(n1 >= 0 && n1 <= 2000) {
			return "Isento";
		}else if(n1 >= 2000.01 && n1 <= 3000) {
			n2 = (n1-2000)*0.08;
		}else if(n1 >= 3000.01 && n1 <= 4500) {			
			n2 = ((n1-2000-(n1-3000))*0.08) + (n1 - 3000)*0.18;
		}else if(n1 > 4500){
			n2 = (n1-2000-(n1-3000))*0.08 + (n1-3000-(n1-4500))*0.18 + (n1 - 4500)*0.28;
		}
		
		return "R$ " + n2;
		
	}
}

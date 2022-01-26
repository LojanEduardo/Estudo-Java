package exSecao10;

import java.util.Scanner;

public class israel {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a quantidade de linhas da Matriz: ");
		int l = sc.nextInt();
		System.out.println("Entre com a quantidade de colunas da Matriz: ");
		int c = sc.nextInt();
		
		String [][] mat = new String[l][c];
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length; j++){
				mat[i][j] = sc.next();
			}
		}
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length; j++){
				
			}
		}
		
		somarMatriz(mat);
		
	}
	
	public static String somarMatriz(String mat [][]) {

		if(mat.length != 4 && mat[0].length != 4) {
			return "Deu pau";
		}
			
		return "Deu certo";
	}
	
}

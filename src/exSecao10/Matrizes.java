package exSecao10;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int contN = 0;
		
		int n = sc.nextInt();
		int [][] mat = new int [n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				System.out.println("Entre com o valor da matriz na posição ["+ i +", "+ j +"]");
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal: ");
		for(int i = 0; i < n; i++) {
			 System.out.println(mat[i][i] + "");
		}
		
		for(int i=0; i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				if(mat[i][j]<0) {
					contN++;
				}
			}
		}
		
		System.out.println("A quantidade de negativos é: " + contN);
		
		sc.close();
	}

}

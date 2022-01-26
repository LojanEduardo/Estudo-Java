package exSecao10;

import java.util.Scanner;

public class MatrizesTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com valor de M: ");
		int m = sc.nextInt();
		System.out.println("Entre com valor de N: ");
		int n = sc.nextInt();
		System.out.println("Entre com valor de X: ");
		int x = sc.nextInt();
		
		int [][] mat = new int [m][n];
		
		for(int i = 0; i < m;i++) {
			for(int j = 0; j < n;j++) {
				System.out.println("Entre com o valor da matriz na posição ["+ i +", "+ j +"]");
				mat[i][j] = sc.nextInt();			
			}
		}
		
		for(int i = 0; i < mat.length;i++) {
			for(int j = 0; j < mat[i].length;j++) {
				if(mat[i][j] == x) {
					System.out.println("---------------------");
					System.out.println("Posição: " + i + ", " + j);
					System.out.println("---------------------");
					if(j>0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					if(i < mat.length-1) {
						System.out.println("Abaixo: " +mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}

package br.com.DesafioCapgemini;

import java.util.Scanner;

public class Questao1 {

//String teclado;
//int n;
//Scanner sc = new Scanner(System.in);
	
public void desenhaEscada(int n) {
	
		for(int i=0; i<n; i++) {
			for (int k=n; k>i+1; k--) {
				System.out.print(" ");
			}
			for( int j=0; j<=i; j++) {
				System.out.print("*");
			}
	
			System.out.println();
	
		}
	
		
	
}

}

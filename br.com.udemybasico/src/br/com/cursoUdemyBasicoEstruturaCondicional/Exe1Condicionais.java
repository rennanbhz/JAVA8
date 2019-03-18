package br.com.cursoUdemyBasicoEstruturaCondicional;

import java.util.Scanner;

public class Exe1Condicionais {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int numero = sc.nextInt();
		
		if (numero < 0 ) {
			System.out.println("Numero negativo");
		}else {
			System.out.println("Numero Positivo");
			
			sc.close();
		}
	}

}

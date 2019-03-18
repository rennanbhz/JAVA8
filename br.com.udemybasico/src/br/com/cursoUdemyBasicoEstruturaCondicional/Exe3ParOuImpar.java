package br.com.cursoUdemyBasicoEstruturaCondicional;

import java.util.Scanner;

public class Exe3ParOuImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0 ) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");
		}
		sc.close();
		}

}

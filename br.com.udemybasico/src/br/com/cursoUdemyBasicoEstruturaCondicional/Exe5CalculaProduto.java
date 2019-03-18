package br.com.cursoUdemyBasicoEstruturaCondicional;

import java.util.Scanner;

public class Exe5CalculaProduto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int qnt = sc.nextInt();

		double total = 0;

		if (codigo == 1) {
			total = qnt * 4.00;
		} else if (codigo == 2) {
			total = qnt * 4.50;
		} else if (codigo == 3) {
			total = qnt * 3.00;
		} else if (codigo == 4){
			total = qnt * 5.00;
		} else if (codigo == 5) {
			total = qnt * 6.50;
		}
			System.out.println("R$ " + total);
		
		sc.close();
	}

}

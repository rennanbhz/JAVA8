package br.com.cursoUdemyBasicoEstruturaCondicional;

import java.util.Scanner;

public class Exe6Intervalo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a < 0 || a > 100) {
			System.out.println("Fora do intervalo!");
		}else if (a <= 25){
			System.out.println("Entre 0 e 25");
		}else if (a <= 50){
			System.out.println("Entre 0 e 50");
		}else if (a<=75){
			System.out.println("Entre 0 e 75");
		}else if (a <=100){
			System.out.println("Entre 0 e 100");
		}
		
		sc.close();
		
	}

	
}

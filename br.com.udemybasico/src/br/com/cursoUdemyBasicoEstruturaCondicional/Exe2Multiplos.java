package br.com.cursoUdemyBasicoEstruturaCondicional;

import java.util.Scanner;

public class Exe2Multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A%B ==0 || B%A==0) {
			System.out.println("S�o Multiplos");
		}else {
			System.out.println("N�o s�o multiplos");
		}
		sc.close();
	}

}

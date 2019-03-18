package br.com.cursoUdemyBasicoEstruturaRepeticao;

import java.util.Scanner;

public class Exe01Senha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha incorreta!!");
			senha = sc.nextInt();
		}

		System.out.println("Acesso permitido!");
		sc.close();
	}

}

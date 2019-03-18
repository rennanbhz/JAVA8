package br.com.cursoUdemyBasicoEntradaDeDados;

import java.util.Scanner;

public class Exercicios1SequenciaDeDados {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	double pi = 3.14159;
	double raio = sc.nextDouble();
	
	double A = pi * raio * raio;
	
	System.out.printf("A=%.4f%n",A);
	sc.close();
	
	}
}

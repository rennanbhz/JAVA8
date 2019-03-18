package br.com.cursoUdemyBasicoEstruturaCondicional;

import java.util.Scanner;

public class Exe7Quadrante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (x == 0 || y == 0) {
			System.out.println("Origem");
		} else if (x > 0 || y > 0) {
			System.out.println("Quadrante Q1");
		} else if (x < 0 || y > 0) {
			System.out.println("Quadrante Q2");
		} else if (x < 0 | y < 0) {
			System.out.println("Quadrante Q3");
		} else if (x > 0 || y < 0) {
			System.out.println("Quadrante Q4");
		}

		sc.close();
	}

}

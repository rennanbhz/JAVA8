package br.com.cursoUdemyBasicoEntradaDeDados;

import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int bedrooms;
		double productPrice;
		String data;
		
		nome = sc.nextLine();
		bedrooms = sc.nextInt();
		productPrice = sc.nextDouble();
		sc.nextLine();
		data = sc.next();
		
		
		System.out.println(nome);
		System.out.println(bedrooms);
		System.out.println(productPrice);
		System.out.print(data);
		
		sc.close();
	}
	
}

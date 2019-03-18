//**********************************************************************
// Copyright (c) 2018 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
package br.com.cursoUdemyBasicoPOOIntro;

import java.util.Scanner;


public class CalculoRetangulo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Exe01Retangulo retangulo = new Exe01Retangulo();
        
        
        System.out.println("Coloque a altura e largura do triangulo abaixo:  ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();
        
        System.out.printf("Area = %.2f%n", retangulo.area());
        System.out.printf("Perimetro = %.2f%n", retangulo.perimeter());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());
        sc.close();
    }

}

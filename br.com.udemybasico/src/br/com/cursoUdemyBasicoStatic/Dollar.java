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
package br.com.cursoUdemyBasicoStatic;

import java.util.Scanner;

public class Dollar
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cotação do dolar: ");
        double dollarPrice = sc.nextDouble();
        
        System.out.println("Quanto deseja comprar? ");
        double buy = sc.nextDouble();
        
        double total = CurrentyConverter.imposto(dollarPrice, buy);
        
        System.out.println(total);
        
        sc.close();
    }
 
}

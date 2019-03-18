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
package br.com.cursoUdemyBasicoEstruturaFor;

import java.util.Scanner;

public class Exe03Media
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int nCases = sc.nextInt();

        for (int i = 0; i < nCases; i++)
        {

            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            double media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}

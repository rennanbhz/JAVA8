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
package br.com.cursoUdemyBasicoEstruturaRepeticao;

import java.util.Scanner;

public class Exe04Divisao
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        int numeroEntrada = sc.nextInt();

        for (int i = 0; i < numeroEntrada; i++)
        {

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            if (i == 0)
            {
                System.out.println("Divisão impossivel");
            }
            else
            {
                double divisao = (double) n1 / n2;
                System.out.println(divisao);
            }
        }
        sc.close();
    }
}

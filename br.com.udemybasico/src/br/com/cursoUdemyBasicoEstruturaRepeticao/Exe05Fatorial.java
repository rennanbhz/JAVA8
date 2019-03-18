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

public class Exe05Fatorial
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;

        for (int i = 1; i <=n; i++)
        {

             fat = fat * i;
            System.out.println(fat);
        }
        sc.close();
    }

}

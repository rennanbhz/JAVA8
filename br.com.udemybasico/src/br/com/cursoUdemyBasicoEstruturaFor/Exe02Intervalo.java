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

public class Exe02Intervalo
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int in = 0;
        int out = 0;
        
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in = in + 1;
            }
            else {
                out = out + 1;
            }
        }
        
        System.out.println(in + " in");
        System.out.println(out + " out");
        
        sc.close();
    }

}

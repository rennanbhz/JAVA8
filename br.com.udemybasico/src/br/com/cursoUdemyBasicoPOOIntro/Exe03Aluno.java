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

public class Exe03Aluno
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.println("Nome do aluno: ");
        aluno.name = sc.nextLine();
        
        System.out.println("Notas: ");
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();
        
        double somaNotas = aluno.nota1 + aluno.nota2 + aluno.nota3;
        System.out.println("Soma das notas: " + somaNotas);
        
        if(somaNotas >= 60) {
            System.out.println("Aluno passou! ");
        }else {
            System.out.println("Aluno reporvado! Faltaram: " + (60 - somaNotas) + "Pontos");

        }
    sc.close();
    }

}

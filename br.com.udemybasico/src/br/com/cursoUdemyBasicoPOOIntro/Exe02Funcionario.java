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

public class Exe02Funcionario
{
    String name;
    double grossSalary;
    double tax;
    
    public double liquidSalary() {
        return grossSalary - tax;
    }
    
    public void increaseSalary(double percentage) {
         grossSalary += (grossSalary / 100) * percentage; 
    }

    @Override
    public String toString()
    {
        return "name=" + name + ", grossSalary: " + grossSalary ;
    }
}

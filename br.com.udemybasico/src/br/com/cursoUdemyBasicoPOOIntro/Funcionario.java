package br.com.cursoUdemyBasicoPOOIntro;

import java.util.Scanner;

public class Funcionario
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Exe02Funcionario funcionario = new Exe02Funcionario();
        
        System.out.println("Name: ");
        funcionario.name = sc.nextLine();
        
        System.out.println("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        
        System.out.println("Aplicated tax: ");
        funcionario.tax = sc.nextDouble();
        
        System.out.println("Name:" + funcionario.name);
        System.out.println("Gross salary: " + funcionario.liquidSalary());
        System.out.println("Which percentage include on this salary? ");
        
        double percentage = sc.nextDouble();
        funcionario.increaseSalary(percentage);
        
        System.out.println("New salary! " + funcionario.grossSalary );
        sc.close();
    }

    
}

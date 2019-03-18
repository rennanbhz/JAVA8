package br.com.cursoUdemyBasicocontabancaria;

import java.util.Scanner;

public class BankAccount
{

    public static void main(String[] args)
    {
        
        Account account;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of Account: ");
        int number = sc.nextInt();

        System.out.println("Enter name of Account owner: ");
        sc.nextLine();
        String name = sc.nextLine();
        
        
        System.out.println("Want to deposit any value? (y/n)");
        char response = sc.next().charAt(0);
        
        if (response == 'y') {
           System.out.println("Digite valor do depósito: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, name, initialDeposit);
        
        }else {
            account = new Account(number, name);
        }
        
        System.out.println(account);
        
        System.out.println("Digite um valor para depósito: ");
        account.deposit(sc.nextDouble());
        
        System.out.println("Valor a ser sacado: ");
        account.withdraw(sc.nextDouble());
        
        System.out.println(account);
    }

}

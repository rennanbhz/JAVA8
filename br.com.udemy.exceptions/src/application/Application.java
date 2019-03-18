package application;

import java.text.ParseException;
import java.util.Scanner;

import br.com.cursoudemy.exceptions.entities.Account;

public class Application
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data: ");
        
        System.out.println("Number: ");
        Integer number = sc.nextInt();
        
        System.out.println("Name: ");
        String name = sc.nextLine();
        
        System.out.println("Initial balance: ");
        Double balance = sc.nextDouble();
        
        System.out.println("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();
        
        Account acc = new Account(number, name, balance, withdrawLimit);
        
        System.out.println();
        System.out.println("Enter value to withdraw");
        Double amount = sc.nextDouble();
        
        try 
        {
            acc.withdraw(amount);
            System.out.println("New balance: " + acc.getBalance());
        }
        catch (Exception e) {
            System.out.println("Withdraw error" + e.getMessage());
        }
        sc.close();
    }
}

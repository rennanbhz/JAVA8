package br.com.cursoUdemyBasicocontabancaria;

public class Account
{
    private int number;
    private String name;
    private double balance;
   
    public void deposit(double value) {
        balance += value;
    }
    
    public void withdraw(double value) {
        balance -= (value + 5.0);
    }
    
    
    //Constructor
    public Account(int number, String name)
    {
        this.number = number;
        this.name = name;
    }
    
    public Account(int number, String name, double initialDeposit)
    {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }
    
    //Getters and setters
    public int getNumber()
    {
        return number;
    }
  
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public double getBalance()
    {
        return balance;
    }

    @Override
    public String toString()
    {
        return "Account number = " 
    + number + ", name = " + name + ", balance = " + balance ;
    }
    
    
}

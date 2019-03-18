package br.com.cursoudemy.exceptions.entities;

public class Account
{
    private Integer number;
    private String name;
    private Double balance;
    private Double withdrawLimit;

    public void deposit(Double amount)
    {
        balance += amount;
    }

    public void withdraw(Double amount) throws Exception 
    {
        if (amount < withdrawLimit)
        {
            throw new Exception("This limit s under of accepted");
        }
        if (amount > withdrawLimit)
        {
            throw new Exception("the limit is up to defined! ");
        }
        balance -= amount;
    }

    public Account()
    {
    }

    public Account(Integer number, String name, Double balance, Double withdrawLimit)
    {
        super();
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getBalance()
    {
        return balance;
    }

    public void setBalance(Double balance)
    {
        this.balance = balance;
    }

    public Double getWithdrawLimit()
    {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit)
    {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public String toString()
    {
        return "Account"
                + number
                + "Name: "
                + name
                + "Balance: "
                + balance
                + "Withdraw limit: "
                + withdrawLimit;
    }
}

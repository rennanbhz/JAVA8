package br.com.cursoudemyintermediario.list;

public class Employee
{
    private int id;
    private String nome;
    private double salario;
    
    public double increaseSalary(double percentage) {
        return salario += (salario + percentage);
    }
    
    public Employee(int id, String nome, double salario)
    {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public double getSalario()
    {
        return salario;
    }

    @Override
    public String toString()
    {
        return id + ", " + nome + ", " + salario;
    }
    
    
    
}

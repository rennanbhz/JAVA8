package br.com.cursoudemyintermediario.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Payment
{

    public static void main(String[] args)
    {
        
        
        Scanner sc = new Scanner(System.in);
        
        List<Employee> employee = new ArrayList<>();
        
        System.out.println("Quantos funcionários a empresa tem? ");
        int n = sc.nextInt();
        
        for(int i=1; i<n; i++) {
            
            System.out.println("Employee" + "#" + i + ":" );
            
            System.out.println("Qual o ID do funcionário? ");
            sc.nextLine();
            int id = sc.nextInt();
            
            
            System.out.println("Nome do funcionario: ");
            String nome = sc.nextLine();
            
            sc.nextLine();
            
            System.out.println("Salário do funcionário: ");
            double salario = sc.nextDouble();
            
            employee.add(new Employee(id, nome, salario));
        }
        
        System.out.println("Qual empregado irá receber aumento? ");
        int id = sc.nextInt();
        Employee emp = employee.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp ==null) {
            System.out.println("Empregado nao existe!");
        }else {
            System.out.println("Coloque a porcentangem de aumento: ");
            double percentage = sc.nextDouble();
            
            emp.increaseSalary(percentage);
            
            for(Employee employees : employee) {
                System.out.println(employees);
                
                sc.close();
            }
        }
    }
}

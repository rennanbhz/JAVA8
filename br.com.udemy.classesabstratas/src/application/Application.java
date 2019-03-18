package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Application
{

    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        
        List<Pessoa> list = new ArrayList<>();
        
        System.out.println("Enter the number of taxi payers: ");
        int n = sc.nextInt();
        
        for(int i = 1; i < n; i++) {
            
            System.out.println("tax payer #" + n + "data " );
            System.out.println("Pessoa física ou juridica? (F/J");
            char type = sc.nextLine().charAt(0);
            
            System.out.println("Name: ");
            String name = sc.nextLine();
            
            System.out.println("Anual income: ");
            Double income = sc.nextDouble();
            
            if(type == 'F') {
                
                System.out.println("Health Expenditure: ");
                Double gastoSaude = sc.nextDouble();
                
                list.add(new PessoaFisica(name, income, gastoSaude));
                
                
            }else {
                System.out.println("Number of employees: ");
                int numeroFuncionarios = sc.nextInt();
                
                list.add(new PessoaJuridica(name, income, numeroFuncionarios));
            }
            
            double sum = 0.0;
            System.out.println();
            System.out.println("TAXES PAID:");
            for (Pessoa tp : list) {
                double tax = tp.imposto();
                System.out.println(tp.getNome() + ": $ " + String.format("%.2f", tax));
                sum += tax;
            }
            
            System.out.println();
            System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
            
            sc.close();
        }
    }
}

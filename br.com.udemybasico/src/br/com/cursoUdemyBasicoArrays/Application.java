package br.com.cursoUdemyBasicoArrays;

import java.util.Scanner;

public class Application
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        
        Rent[] rents = new Rent[10];

        System.out.println("Quantos quartos serão alugados? ");
        int n = sc.nextInt();
        
        for(int i = 1; i<n; i++) {
            
        System.out.println("Rent # " + i + ":");
        System.out.println("Nome do responsável: ");
        sc.nextLine();
        String name = sc.nextLine();
        
        System.out.println("Email: ");
        String email = sc.nextLine();
        
        System.out.println("Qual quarto deseja alugar? ");
        int room = sc.nextInt();
        
        rents[room] = new Rent(name, email);
        
        }
        
        System.out.println();
        System.out.println("Quartos ocupados: ");
        
        for(int i=0; i<10; i++) {
            if(rents[i] != null) {
                System.out.println(i + ":" + rents[i]);
            }
        }
        
        sc.close();
        
    }

}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import domain.entities.Contract;
import domain.entities.Installment;
import service.ContractService;
import service.PayPalService;

public class Program
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter contract data: ");
        System.out.println("Number: ");
        
        int number = sc.nextInt();
        
        System.out.println("Date: (dd/MM/yyyy) ");
        Date date = sdf.parse(sc.next());
        
        System.out.println("Contract value: ");
        Double totalValue = sc.nextDouble();
        
        Contract contract = new Contract(number, date, totalValue);
        
        System.out.println("Enter number of installments: ");
        
        int n = sc.nextInt();
        
        ContractService contractService = new ContractService(new PayPalService());
        
        contractService.processContract(contract, n);
        
        for (Installment installment : contract.getInstallment())
        {
            System.out.println(installment);
        }
        sc.close();
    }
}

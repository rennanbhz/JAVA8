package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.cursoudemy.composition.entities.Departament;
import br.com.cursoudemy.composition.entities.HourContract;
import br.com.cursoudemy.composition.entities.Worker;
import enums.WorkerLevel;

public class Program
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("How is departament? ");
        String departamentName = sc.nextLine();
        
        System.out.print("Enter worker data: ");
        
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        
        System.out.print("Salary: ");
        double baseSalary = sc.nextDouble();
        
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
        
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        
        for(int i=1; i<n; i++) 
        {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.print("Date DD/MM/YYYY");
            Date contractDate = sdf.parse(sc.next());
            
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            
            System.out.println("Duration (hours): ");
            Integer hours = sc.nextInt();
            
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
            
            System.out.println("Enter month and year to calculate income (MM/YYYY): ");
            String monthAndYear = sc.next();
            int month = Integer.parseInt(monthAndYear = sc.next().substring(0, 2));
            int year = Integer.parseInt(monthAndYear = sc.next().substring(3));
            
            System.out.println("Name: " + worker.getName());
            System.out.println("Departament: " + worker.getDepartament());
            System.out.println("Income for: " + monthAndYear + ": " + String.format("%2f", worker.income(year, month)));
        }
        
        sc.close();
    }
}

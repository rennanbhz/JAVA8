package br.com.cursoudemy.composition.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import enums.WorkerLevel;

public class Worker
{
    private String workerName;
    private WorkerLevel level;
    private Double baseSalary;
    
    //Associations
    private Departament departament;
    private List<HourContract> contracts = new ArrayList<>();
    

    public Worker(String workerName, WorkerLevel level, Double baseSalary, Departament departament)
    {
        this.workerName = workerName;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public void addContract(HourContract contract) 
    {
        contracts.add(contract);
    }
    
    public void removeContracts(HourContract contract) 
    {
        contracts.remove(contract);
    }
    
    public double income(int year, int month) 
    {
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        
        for(HourContract contr : contracts) 
        {
            cal.setTime(contr.getDate());
            int contr_year = cal.get(Calendar.YEAR);
            int contr_month = 1 + cal.get(Calendar.MONTH);
            
            if(year == contr_year && month == contr_month) 
            {
                sum += contr.totalValue();
            }
        }
        return sum;
    }
    
    public String getName()
    {
        return workerName;
    }

    public void setName(String workerName)
    {
        this.workerName = workerName;
    }

    public WorkerLevel getLevel()
    {
        return level;
    }

    public void setLevel(WorkerLevel level)
    {
        this.level = level;
    }

    public Double getBaseSalary()
    {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament()
    {
        return departament;
    }

    public void setDepartament(Departament departament)
    {
        this.departament = departament;
    }

    public List<HourContract> getContracts()
    {
        return contracts;
    }
}

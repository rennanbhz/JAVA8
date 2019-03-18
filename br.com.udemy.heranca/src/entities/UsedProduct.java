package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product
{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date manufacturedDate;
    

    public UsedProduct(String name, Double price)
    {
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufacturedDate()
    {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate)
    {
        this.manufacturedDate = manufacturedDate;
    }
    
    @Override
    public String priceTag() {
        return getName()
        + "R$"
        + String.format("%.2f", getPrice())
        + "Manufactory Date: " + sdf.format(manufacturedDate);
    }
}

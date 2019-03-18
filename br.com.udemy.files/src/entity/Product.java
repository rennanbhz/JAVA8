package entity;

public class Product
{
    private String name;
    private Double price;
    private int quantity;
    
    public Product() 
    {
        
    }
    
    public Product(String name, Double preco, int quantidade)
    {
        this.name = name;
        this.price = preco;
        this.quantity = quantidade;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Double getPrice()
    {
        return price;
    }

    public void setPrice(Double preco)
    {
        this.price = preco;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantidade)
    {
        this.quantity = quantidade;
    }
    
    public double total() {
        return price * quantity;
    }
}

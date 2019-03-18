package br.com.cursoudemy.composition.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enums.OrderStatus;

public class Order
{
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    private Date moment;
    private OrderStatus status;
    
    //Associations
    Client client;
    List<OrderItem> orderItem = new ArrayList<>();

    
    public void addItem(OrderItem item) 
    {
        orderItem.add(item);
    }
    
    public void removeItem(OrderItem item) 
    {
        orderItem.remove(item);
    }
    
    public double total() 
    {
        double totalSum = 0.0;
        for(OrderItem itens : orderItem) 
        {
            totalSum += itens.subTotal();
        }
        return totalSum;
    }
    
    public Order(Date moment, OrderStatus status, Client client)
    {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Order()
    {
    }

    public Date getMoment()
    {
        return moment;
    }

    public void setMoment(Date moment)
    {
        this.moment = moment;
    }

    public OrderStatus getStatus()
    {
        return status;
    }

    public void setStatus(OrderStatus status)
    {
        this.status = status;
    }

    public Client getClient()
    {
        return client;
    }

    public void setClient(Client client)
    {
        this.client = client;
    }

    public List<OrderItem> getOrderItem()
    {
        return orderItem;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order Status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order itens:\n ");
        for(OrderItem item : orderItem) 
        {
            sb.append(item + "\n");
        }
        
        sb.append("Total Price: ");
        sb.append(total() + "\n");
        return sb.toString();
    }
}

package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.cursoudemy.composition.entities.Client;
import br.com.cursoudemy.composition.entities.Order;
import br.com.cursoudemy.composition.entities.OrderItem;
import br.com.cursoudemy.composition.entities.Product;
import enums.OrderStatus;

public class ProgramOrder
{

    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter client data: ");
        sc.nextLine();
        
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("E-mail: ");
        String email = sc.nextLine();
        
        System.out.print("Enter birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        
        Client client = new Client(name, email, birthDate);
        
        System.out.println("Enter order data: ");
        
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        Order order = new Order(new Date(), status, client);
        
        System.out.println("How many itens to this order? ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            
            System.out.print("Product name ");
            sc.nextLine();
            String productName = sc.nextLine();
            
            System.out.println("Product price ");
            Double price = sc.nextDouble();
            
            Product product = new Product(productName, price);

            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            
            OrderItem orderItem = new OrderItem(quantity, price, product);
            order.addItem(orderItem);
        }
        
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
        
        sc.close();
    }
}

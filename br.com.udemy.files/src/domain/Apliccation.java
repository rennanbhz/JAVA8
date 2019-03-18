package domain;

import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Product;

public class Apliccation
{

    public static void main(String[] args) throws ParseException
    {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.println("Enter the file path: ");

        String filePath = sc.nextLine();

        File sourceFile = new File(filePath);
        String folderPath = sourceFile.getParent();

        boolean success = new File(filePath + "\\out").mkdir();

        File targetFile = new File(filePath + "\\out\\summary.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {

            String itemCsv = br.readLine();
            while (itemCsv != null) {

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                products.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {

                for (Product item : products) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFile + " CREATED!");
                
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}
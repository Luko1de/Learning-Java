import Entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Product product = new Product();

     System.out.println("Enter Product Data");
     System.out.println("Name");
     product.name = sc.nextLine();

     System.out.println("Price");
     product.price = sc.nextDouble();

     System.out.println("Stock");
     product.quantity = sc.nextInt();

     System.out.println("Product Data: "+ product);
     System.out.println("Enter the number of products to be added in Stock:");
     int quantity = sc.nextInt();
     product.Addproduct(quantity);

     System.out.println("Updated Product Data: " + product);
     quantity = sc.nextInt();

     product.RemoveProduct(quantity);
     System.out.println("Updated Product Data: " + product);

     sc.close();
    }
}
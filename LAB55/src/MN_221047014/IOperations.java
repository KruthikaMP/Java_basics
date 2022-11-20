package MN_221047014;

import java.io.*;
import java.util.Scanner;

public class IOperations {
    ProductStore obj = (ProductStore) new Operations();
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    int product_id,product_price;
    String product_name;
    public void addProd() throws IOException {


        System.out.println("Enter how many enters that needs to be added: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("please enter product ID\n");
            product_id = sc.nextInt();
            System.out.println("please enter product Name\n");
            product_name = sc1.nextLine();
            System.out.println("please enter product Price\n");
            product_price = sc.nextInt();

            obj.addProduct(product_id, product_name, product_price);
        }
    }
    public void updateProd() throws IOException {
        System.out.println("Please enter the products you need to update: \n ");

        System.out.println("please enter product ID\n");
        product_id = sc.nextInt();
        System.out.println("please enter product Name\n");
        product_name = sc1.nextLine();
        System.out.println("please enter product Price\n");
        product_price = sc.nextInt();
        obj.upDate(product_id, product_name, product_price);
    }
}

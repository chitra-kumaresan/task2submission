package Ttasktwo;
import java.util.Scanner;
import java.util.*;

import static javax.swing.UIManager.get;

public class XYZ {
    private static Product[] products;
public static int amount=0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of product :");
        int n = s.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            products = new Product[2];
            System.out.println("enter the pid : ");
           System.out.println("enter the price :");
            System.out.println("enter required quantity :");
            Product product = new Product(s.nextInt(), s.nextInt(), s.nextInt());
            list.add(product);
        }
        int max = list.get(0).getPrice();
        int productId = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() > max) {
                max = list.get(i).getPrice();
                productId = list.get(i).getPid();
            }


        }
        System.out.println("highest pid :" + productId);
        for (int i = 0; i <n ; i++) {
            method(list.get(i));
        }     

    }
    public static void method(Product product){
        amount= product.getPrice()* product.getQuantity();
        System.out.println("amount :" +amount);
    }

}













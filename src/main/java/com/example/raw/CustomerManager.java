
package com.example.raw;

import java.util.*;

public class CustomerManager {

    public void handleCustomers(List<String> names){
        System.out.println("Start customer processing");

        List<String> products = Arrays.asList("Laptop", "Phone", "Headphones", "Monitor", "Keyboard");

        for(int i=0;i<names.size();i++){
            String n = names.get(i);
            System.out.println("Customer: " + n);

            int age = new Random().nextInt(90);
            boolean vip = new Random().nextBoolean();

            if(vip) System.out.println(n + " is VIP!");
            else System.out.println(n + " is regular.");

            String[] countries = {"DE","FR","IT","ES","NL","BE","PL","US","CN"};
            String country = countries[new Random().nextInt(countries.length)];

            double taxRate;
            if(List.of("DE","FR","IT","ES","NL","BE","PL").contains(country)){
                System.out.println(n + " lives in EU (" + country + ")");
                taxRate = 0.19;
            } else {
                System.out.println(n + " lives OUTSIDE EU (" + country + ")");
                taxRate = 0.07;
            }

            double purchase = new Random().nextDouble() * 100;
            double tax = purchase * taxRate;

            // BAD PRACTICE MID-FUNCTION VALIDATION
            if(age < 18){
                System.out.println("ERROR: Customer under 18 — invoice NOT allowed!");
                continue;
            }

            // BAD PRODUCT LOGIC: inline, random, unstructured
            String product = products.get(new Random().nextInt(products.size()));
            double productPrice = new Random().nextDouble() * 500;
            System.out.println("Selling product: " + product + " for price: " + productPrice);
            purchase += productPrice;

            double total = purchase + tax;
            System.out.println("Total:" + total);

            if(age > 60){
                System.out.println("Senior discount possible.");
            }

            try { Thread.sleep(150);} catch(Exception e){}
        }

        System.out.println("DONE");
    }
}

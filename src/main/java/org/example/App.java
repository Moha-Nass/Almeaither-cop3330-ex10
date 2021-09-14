package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Exercise 10 - Self-Checkout");
        double price1,price2, price3;
        double quantity1, quantity2, quantity3, sub, tax, total;

        System.out.print("Enter the price of item 1: ");
        Scanner in = new Scanner(System.in);
        price1 = Double.parseDouble(in.next());
        System.out.print("Enter the quantity of item 1: ");
        quantity1 = Double.parseDouble(in.next());



        System.out.print("Enter the price of item 2: ");
        price2 = Double.parseDouble(in.next());
        System.out.print("Enter the quantity of item 2: ");
        quantity2 = Double.parseDouble(in.next());

        System.out.print("Enter the price of item 3: ");
        price3 = Double.parseDouble(in.next());
        System.out.print("Enter the quantity of item 3: ");
        quantity3 = Double.parseDouble(in.next());

        sub = price1 * quantity1 + price2 * quantity2 + price3 * quantity3;

        tax = 0.055 * sub;
        total = tax + sub;
        System.out.println("Subtotal: $"+sub);
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
    }
}

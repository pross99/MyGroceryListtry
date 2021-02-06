package com.ross;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();

        boolean quit= false;
        int choice = 0;
        printOptions();


        while(!quit) {

            System.out.println("Please enter your choice");
            choice = input.nextInt();
            input.nextLine();


            switch (choice) {
                case 1:
                    groceryList.myFoodArrayList();
                    System.out.println("type the given item number to add it to your basket");
                    System.out.println("type 15 to go back");



            }
        }




        }
        public static void printOptions() {

            System.out.println("\n Press:");
            System.out.println(" 1 to visit the food aisle ");
            System.out.println(" 2 to visit the grocery gift cards aisle ");
            System.out.println(" 3 to visit the paper products aisle ");
            System.out.println(" 4 to visit the Cleaning products aisle");
            System.out.println(" 5 to view your basket");
            System.out.println(" 6 to checkout");
    }
}

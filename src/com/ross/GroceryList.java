package com.ross;

import java.util.ArrayList;

public class GroceryList {


    public void myFoodArrayList() {
        ArrayList<String> foodItems = new ArrayList<String>();


        foodItems.add(" 1 Fresh fruit");
        foodItems.add(" 2 Mircowave meals");
        foodItems.add(" 3 Mac&Cheese");
        foodItems.add(" 4 Cereal");
        foodItems.add(" 5 Canned soup");
        foodItems.add(" 6 Cookies");
        foodItems.add(" 7 Granola bars");
        foodItems.add(" 8 Pop-tarts");
        foodItems.add(" 9 Coffe creamer");
        foodItems.add(" 10 Fruit snacks");
        foodItems.add(" 11 Breakfast bars");
        foodItems.add(" 12 Pudding");
        foodItems.add(" 13 Juice boxes");






        for (String i : foodItems) {
            System.out.println(i);


            //for (int i =0; i < foodItems.size(); i++) {
            // System.out.println(foodItems.get(i));
        }


    }

    public void myGiftArrayList() {
        ArrayList giftCards = new ArrayList();

        giftCards.add(" 1 Walmart");
        giftCards.add(" 2 Amazon");
        giftCards.add(" 3 Local grocery stores");
    }

    public void myPaperArrayList() {

        ArrayList paperProducts = new ArrayList();
        paperProducts.add(" 1 Paper towels");
        paperProducts.add(" 2 Toilet paper");
        paperProducts.add(" 3 Napkins");
        paperProducts.add(" 4 Paper plates");
        paperProducts.add(" 5 facial tissues");
        paperProducts.add(" 6 Disposable coffe cups");

    }
    public void myCleanArrayList() {
        ArrayList cleaningProducts = new ArrayList();

        cleaningProducts.add(" 1 Laundery detergent");
        cleaningProducts.add(" 2 Liquid hand soap");
        cleaningProducts.add(" 3 Bleach");
        cleaningProducts.add(" 4 Dishwasing liquid");
        cleaningProducts.add(" 5 Diswasher detergent");
        cleaningProducts.add(" 6 Disinfecting wipes");
        cleaningProducts.add(" 7 Window cleaner");
        cleaningProducts.add(" 8 Trash bags");
        cleaningProducts.add(" 9 Dryer sheets");
    }

}
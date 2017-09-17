package com.example.java;

public class Main {

    public static void main(String[] args) {
        //stores the inventory as a string
        String[][] pizzaPlace = new String[2][5];

        //initialize array
        pizzaPlace[0][0] = "Dough";
        pizzaPlace[1][0] = "10";
        pizzaPlace[0][1] = "Sauce";
        pizzaPlace[1][1] = "18";
        pizzaPlace[0][2] = "Cheese";
        pizzaPlace[1][2] = "25";
        pizzaPlace[0][3] = "Pepperoni";
        pizzaPlace[1][3] = "50";
        pizzaPlace[0][4] = "Beef";
        pizzaPlace[1][4] = "8";

        //print out array
        for( int r = 0; r < 2; r++) {
            for (int c = 0; c < 5; c++) {
                System.out.println(pizzaPlace[r][c]+ " ");
            }
        }
    }
}

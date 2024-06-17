package com.epam.loops;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        /*
        Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
         */

        for (int i = 1; i <= 10; i++) {
            System.out.println(numberTableToPrint + " * " + i + " = " + numberTableToPrint * i);
        }

    }

}

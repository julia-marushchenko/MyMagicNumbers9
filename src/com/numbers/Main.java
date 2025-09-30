// Java program to find numbers dividable 3

package com.numbers;

import java.util.ArrayList;
import java.util.List;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating list of numbers
        List <Integer> list = new ArrayList<>();

        // Adding numbers to a list
        for (int index = 0; index < 100; index++) {
            list.add(index);
        }

        // Checking that numbers are dividable by 3
        for(Integer element: list) {

            // Condition
            if (element % 3 == 0){

                // Printing result to console
                System.out.println(element + " is dividable by 3.");

            } else {

                // Printing result to console
                System.out.println(element + " is not dividable by 3.");
            }
        }
    }
}
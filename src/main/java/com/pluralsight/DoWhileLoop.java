package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 0;
        // Executes the block first, then checks the condition
        do {
            System.out.println("I love Java");
            count++;
        } while (count < 5);
    }
}


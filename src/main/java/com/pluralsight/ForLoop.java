package com.pluralsight;

public class ForLoop {
    // Note the added 'throws InterruptedException' required for Thread.sleep
    public static void main(String[] args) throws InterruptedException {
        // Counts down from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000); // Pauses for 1 second
        }
        System.out.println("Launch!");
    }
}


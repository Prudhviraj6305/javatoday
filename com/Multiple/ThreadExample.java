package com.Multiple;

public class ThreadExample {
    public static void main(String[] args) {
        Multi t1 = new Multi();
        Multi t2 = new Multi();

        t1.start();  // Start the first thread
        t2.start();  // Start the second thread
    }
}
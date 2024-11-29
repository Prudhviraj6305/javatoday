package com.Multiple;

class Multi extends Thread {
 
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(500);  // Pause for 500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



package com.tanya.lab9.ex1;

public class TimerTask implements Runnable {

    @Override
    public void run() {

        int count = 1;

        try {

            while (true) {
                System.out.println("Timer : " + count * 10 + " seconds");
                Thread.sleep(10000);
                count++;
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
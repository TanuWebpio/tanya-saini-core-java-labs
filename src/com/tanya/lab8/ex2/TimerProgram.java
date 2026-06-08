package com.tanya.lab8.ex2;

public class TimerProgram {

    public static void main(String[] args) {

        TimerThread timer = new TimerThread();

        Thread t = new Thread(timer);

        t.start();
    }
}
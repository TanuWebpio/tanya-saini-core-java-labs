package com.tanya.lab9.ex1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TimerProgram {

    public static void main(String[] args) {

        ExecutorService executor =
                Executors.newSingleThreadExecutor();

        executor.execute(new TimerTask());

        executor.shutdown();
    }
}

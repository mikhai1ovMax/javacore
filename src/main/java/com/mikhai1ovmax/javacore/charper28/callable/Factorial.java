package main.java.com.mikhai1ovmax.javacore.charper28.callable;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
    int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i < stop; i++) {
            fact *= i;
        }
        return fact;
    }
}

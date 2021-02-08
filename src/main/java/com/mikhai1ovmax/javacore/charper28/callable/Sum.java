package main.java.com.mikhai1ovmax.javacore.charper28.callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call(){
        int sum = 0;
        for (int i = 1; i < stop; i++) {
            sum+=i;
        }
        return sum;
    }
}

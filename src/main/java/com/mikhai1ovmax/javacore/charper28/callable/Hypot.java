package main.java.com.mikhai1ovmax.javacore.charper28.callable;

import java.util.concurrent.Callable;

public class Hypot implements Callable<Double> {
    double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt(side1*side1 + side2*side2);
    }
}

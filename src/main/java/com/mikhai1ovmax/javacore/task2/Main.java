package main.java.com.mikhai1ovmax.javacore.task2;



import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Phaser;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        Phaser phaser = new Phaser();
        FizzBuzz fizzBuzz = new FizzBuzz(n, phaser);
        CompletableFuture.runAsync(()-> fizzBuzz.fizz());
        CompletableFuture.runAsync(()-> fizzBuzz.buzz());
        CompletableFuture.runAsync(()-> fizzBuzz.fizzbuzz());
        CompletableFuture.runAsync(()-> fizzBuzz.number());
    }


}

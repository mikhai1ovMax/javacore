package main.java.com.mikhai1ovmax.javacore.task2;



import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Phaser;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int n = 16;
        FizzBuzz fizzBuzz = new FizzBuzz(n);
        fizzBuzz.startThreads();
    }
}

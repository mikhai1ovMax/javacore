package main.java.com.mikhai1ovmax.javacore.task2;

import java.util.concurrent.Phaser;
import java.util.concurrent.locks.ReentrantLock;

public class FizzBuzz {
    final int n;
    Phaser phaser = new Phaser();

    FizzBuzz(int n) {
        this.n = n;
    }

    public void startThreads() {
        new Thread(this::buzz).start();
        new Thread(this::fizz).start();
        new Thread(this::fizzbuzz).start();
        new Thread(this::number).start();
    }

    public void fizz() {
        phaser.register();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println("fizz");
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        phaser.arriveAndDeregister();
    }

    public void buzz() {
        phaser.register();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 == 0)
                System.out.println("buzz");
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        phaser.arriveAndDeregister();
    }

    public void fizzbuzz() {
        phaser.register();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("fizzbuzz");
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        phaser.arriveAndDeregister();
    }

    public void number() {
        phaser.register();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0)
                System.out.println(i);
            phaser.arriveAndAwaitAdvance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        phaser.arriveAndDeregister();
    }

}

package main.java.com.mikhai1ovmax.javacore.task2;

import java.util.concurrent.Phaser;

public class FizzBuzz {
    int n;
    Phaser phaser;

    FizzBuzz(int n, Phaser phaser){
        this.n = n;
        this.phaser = phaser;

    }

    public void fizz(){
        phaser.register();
        for (int i = 1 ; i <= n; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println("fizz");
            phaser.arriveAndAwaitAdvance();
        }
        phaser.arriveAndDeregister();
    }

    public void buzz(){
        phaser.register();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 == 0)
                System.out.println("buzz");
            phaser.arriveAndAwaitAdvance();
        }
        phaser.arriveAndDeregister();
    }

    public void fizzbuzz(){
        phaser.register();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("fizzbuzz");
            phaser.arriveAndAwaitAdvance();
        }
        phaser.arriveAndDeregister();
    }

    public void number(){
        phaser.register();
        for (int i = 1; i <= n; i++) {
            if (i % 3 != 0 && i % 5 != 0)
                System.out.println(i);
            phaser.arriveAndAwaitAdvance();
        }
        phaser.arriveAndDeregister();
    }
}

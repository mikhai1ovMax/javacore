package main.java.com.mikhai1ovmax.javacore.charper28.executor;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    String name;
    CountDownLatch latch;

    public MyThread(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}

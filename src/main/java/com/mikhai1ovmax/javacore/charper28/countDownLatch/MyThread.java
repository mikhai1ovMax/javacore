package main.java.com.mikhai1ovmax.javacore.charper28.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyThread implements Runnable{
    CountDownLatch latch;
    MyThread(CountDownLatch latch){
        this.latch = latch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }
}

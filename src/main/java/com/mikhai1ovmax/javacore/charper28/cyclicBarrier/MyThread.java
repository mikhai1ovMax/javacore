package main.java.com.mikhai1ovmax.javacore.charper28.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyThread implements Runnable{
    CyclicBarrier cb;
    String name;

    public MyThread(CyclicBarrier cb, String name) {
        this.cb = cb;
        this.name = name;
        new Thread(this).start();
    }


    @Override
    public void run() {
        System.out.println(name);
        try {
            cb.await();
        } catch (InterruptedException e) {
            System.out.println(e);
        } catch (BrokenBarrierException e) {
            System.out.println(e);
        }
    }
}

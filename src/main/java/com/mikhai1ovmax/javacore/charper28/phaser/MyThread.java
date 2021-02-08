package main.java.com.mikhai1ovmax.javacore.charper28.phaser;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable {
    Phaser phsr;
    String name;

    public MyThread(Phaser phsr, String name) {
        this.phsr = phsr;
        this.name = name;
        this.phsr.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("поток " + name + " начинает первую фазу");
        phsr.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("поток " + name + " начинает вторую фазу");
        phsr.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("поток " + name + " начинает третью фазу");
        phsr.arriveAndDeregister();
    }
}

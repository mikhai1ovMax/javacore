package main.java.com.mikhai1ovmax.javacore.charper28.phaserOnAdvance;

import java.util.concurrent.Phaser;

public class MyThread implements Runnable{
    Phaser phaser;
    String name;

    public MyThread(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        this.phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()){
            System.out.println("поток " + name + " начинает фазу " + phaser.getPhase());
            phaser.arriveAndAwaitAdvance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

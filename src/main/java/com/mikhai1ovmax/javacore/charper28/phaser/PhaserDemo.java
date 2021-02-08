package main.java.com.mikhai1ovmax.javacore.charper28.phaser;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        System.out.println("запуск потоков");
        new MyThread(phaser, "a");
        new MyThread(phaser, "b");
        new MyThread(phaser, "c");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("фаза " + curPhase + " завершена");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("фаза " + curPhase + " завершена");

        phaser.arriveAndDeregister();

        if(phaser.isTerminated())
            System.out.println("синхронизатор фаз завершен");
    }
}

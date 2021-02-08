package main.java.com.mikhai1ovmax.javacore.charper28.phaserOnAdvance;

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 4);
        System.out.println("Запуск потоков");

        new MyThread(phaser, "a");
        new MyThread(phaser, "b");
        new MyThread(phaser, "c");

        while (!phaser.isTerminated()){
            phaser.arriveAndAwaitAdvance();
        }
        System.out.println("синхронизатор фаз завершен");

    }
}

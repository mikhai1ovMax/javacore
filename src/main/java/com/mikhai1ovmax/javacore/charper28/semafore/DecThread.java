package main.java.com.mikhai1ovmax.javacore.charper28.semafore;

import java.util.concurrent.Semaphore;

public class DecThread implements Runnable {
    Semaphore sem;
    String name;

    DecThread(Semaphore sem, String name) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }


    @Override
    public void run() {
        System.out.println("запуск потока " + name);
        try {
            System.out.println("поток " + name + " ожидает разрешения");
            sem.acquire();
            System.out.println("поток " + name + " получает разрешение");
            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ":" + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("поток " + name + " освобожает разрешение");
        sem.release();
    }
}

package main.java.com.mikhai1ovmax.javacore.task1;

import java.util.concurrent.Semaphore;

public class Foo {

    Semaphore semFirstThread = new Semaphore(1);
    Semaphore semSecondThread = new Semaphore(0);
    Semaphore semThirdThread = new Semaphore(0);

    public void first() {
        try {
            semFirstThread.acquire();
            System.out.print("first");
            semSecondThread.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void second() {
        try {
            semSecondThread.acquire();
            System.out.print("second");
            semThirdThread.release();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void third() {
        try {
            semThirdThread.acquire();
            System.out.print("third");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

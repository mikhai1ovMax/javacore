package main.java.com.mikhai1ovmax.javacore.task1;

import java.util.concurrent.Semaphore;

public class Foo {

    Semaphore semFirstThread = new Semaphore(1);
    Semaphore semSecondThread = new Semaphore(0);
    Semaphore semThirdThread = new Semaphore(0);


    void printWord(int wordNum){
        switch (wordNum){
            case 1->{
                try {
                    semFirstThread.acquire();
                    first();
                    semSecondThread.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            case 2->{
                try {
                    semSecondThread.acquire();
                    second();
                    semThirdThread.release();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            case 3->{
                try {
                    semThirdThread.acquire();
                    third();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third");
    }
}

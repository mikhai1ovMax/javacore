package main.java.com.mikhai1ovmax.javacore.charper28.twoSemafores;

import java.util.concurrent.Semaphore;

public class Q {
    int n;

    static Semaphore semCon = new Semaphore(0);
    static Semaphore semProd = new Semaphore(1);

    void get(){
        try{
            semCon.acquire();
        }catch (InterruptedException e){
            System.out.println("перехвачено InterruptedException");
        }
        System.out.println("получено: " + n);
    }

    void put(int n){
        try{
            semCon.acquire();
        }catch (InterruptedException e){
            System.out.println("перехвачено InterruptedException");
        }
        this.n = n;
        System.out.println("отправлено " + n);
        semCon.release();
    }
}

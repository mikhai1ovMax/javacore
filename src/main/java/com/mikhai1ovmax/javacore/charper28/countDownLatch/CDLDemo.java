package main.java.com.mikhai1ovmax.javacore.charper28.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        System.out.println("запуск потока исполнения");

        new MyThread(cd1);
        try {
            cd1.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println("завершение потока исполнения");
    }
}

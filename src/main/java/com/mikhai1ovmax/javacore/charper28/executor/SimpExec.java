package main.java.com.mikhai1ovmax.javacore.charper28.executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);
        CountDownLatch latch2 = new CountDownLatch(5);
        CountDownLatch latch3 = new CountDownLatch(5);
        CountDownLatch latch4 = new CountDownLatch(5);
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new MyThread("a", latch));
        executorService.execute(new MyThread("b", latch2));
        executorService.execute(new MyThread("c", latch3));
        executorService.execute(new MyThread("d", latch4));

        try {
            latch.await();
            latch2.await();
            latch3.await();
            latch4.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        executorService.shutdown();
        System.out.println("завершение потоков");


    }
}

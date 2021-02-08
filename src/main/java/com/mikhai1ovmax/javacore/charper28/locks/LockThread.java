package main.java.com.mikhai1ovmax.javacore.charper28.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable{
    String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("запуск потока " + name);
        try {
            System.out.println("поток " + name + " ожидает блокировки счетчика");
            lock.lock();
            System.out.println("поток " + name + " блокирует счетчика");
            Shared.count++;
            System.out.println("поток " + name + ": " + Shared.count);
            System.out.println("поток " + name + " ожидает");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println(e);
        }finally {
            System.out.println("поток " + name + " разблокирует счетчика");
            lock.unlock();
        }
    }
}

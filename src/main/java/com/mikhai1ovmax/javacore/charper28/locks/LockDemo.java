package main.java.com.mikhai1ovmax.javacore.charper28.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        new LockThread("a", lock);
        new LockThread("b", lock);
        new LockThread("c", lock);

    }
}

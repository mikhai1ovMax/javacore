package main.java.com.mikhai1ovmax.javacore.task1;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1,true);
        Foo foo = new Foo();
        Printer printer = new Printer(semaphore, foo, 1);
        Printer printer1 = new Printer(semaphore, foo, 2);
        Printer printer2 = new Printer(semaphore, foo, 3);



    }
}

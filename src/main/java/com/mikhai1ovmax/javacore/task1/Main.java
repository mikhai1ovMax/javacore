package main.java.com.mikhai1ovmax.javacore.task1;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread1 thread1 = new Thread1(foo);
        Thread2 thread2 = new Thread2(foo);
        Thread3 thread3 = new Thread3(foo);

    }
}

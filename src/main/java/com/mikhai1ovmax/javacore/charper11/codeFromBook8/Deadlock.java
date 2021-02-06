package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook8;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    Deadlock(){
        Thread.currentThread().setName("Глaвный поток");
        Thread t = new Thread(this, "Соперничающий поток");
        t.start();

        a.foo(b);
        System.out.println("Haзaд в главный поток" );
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Haзaд в другой поток" );
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}

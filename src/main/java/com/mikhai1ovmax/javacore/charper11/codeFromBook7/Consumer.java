package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook7;

public class Consumer implements Runnable {
    Q q = new Q();

    public Consumer(Q q) {
        this.q = q;
        new Thread(this, "потребитель").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}

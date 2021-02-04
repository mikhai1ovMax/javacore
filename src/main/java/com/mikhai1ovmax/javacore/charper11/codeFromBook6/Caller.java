package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook6;

public class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;

    public Caller (Callme target, String msg) {
        this.msg = msg;
        this.target = target;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook6;

public class SynchronizedCaller implements Runnable{
    Callme target;
    String msg;
    Thread t;

    public SynchronizedCaller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        t= new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target){
            target.call(msg);
        }
    }
}

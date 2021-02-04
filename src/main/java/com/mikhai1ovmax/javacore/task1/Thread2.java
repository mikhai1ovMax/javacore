package main.java.com.mikhai1ovmax.javacore.task1;

public class Thread2 extends Thread{
    Foo foo;

    public Thread2(Foo foo) {
        this.foo = foo;
        start();
    }

    @Override
    public void run() {
        foo.printSecondWorld();
    }
}

package main.java.com.mikhai1ovmax.javacore.task1;

public class Thread1 extends Thread{
    Foo foo;

    public Thread1(Foo foo) {
        this.foo = foo;
        start();
    }

    @Override
    public void run() {
        foo.printFirstWorld();
    }
}

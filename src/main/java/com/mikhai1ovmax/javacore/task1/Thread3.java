package main.java.com.mikhai1ovmax.javacore.task1;

public class Thread3 extends Thread{
    Foo foo;

    public Thread3(Foo foo) {
        this.foo = foo;
        start();
    }

    @Override
    public void run() {
        foo.printThirdWorld();
    }
}
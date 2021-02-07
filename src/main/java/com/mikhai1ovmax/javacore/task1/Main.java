package main.java.com.mikhai1ovmax.javacore.task1;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        Foo foo = new Foo();
        CompletableFuture.runAsync(()-> foo.printWord(3));
        CompletableFuture.runAsync(()-> foo.printWord(2));
        CompletableFuture.runAsync(()-> foo.printWord(1));

    }
}

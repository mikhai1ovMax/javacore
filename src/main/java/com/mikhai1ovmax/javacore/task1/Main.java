package main.java.com.mikhai1ovmax.javacore.task1;

import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {

        Foo foo = new Foo();
        CompletableFuture.runAsync(()-> foo.first());
        CompletableFuture.runAsync(()-> foo.second());
        CompletableFuture.runAsync(()-> foo.third());

    }
}

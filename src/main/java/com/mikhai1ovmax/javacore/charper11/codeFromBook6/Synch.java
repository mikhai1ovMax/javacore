package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook6;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
//        Caller ob1 = new Caller(target, "добро пожаловать");
//        Caller ob2 = new Caller(target, "в синхронизированный");
//        Caller ob3 = new Caller(target, "мир!");
        SynchronizedCaller ob1 = new SynchronizedCaller(target, "добро пожаловать");
        SynchronizedCaller ob2 = new SynchronizedCaller(target, "в синхронизированный");
        SynchronizedCaller ob3 = new SynchronizedCaller(target, "мир!");

    }
}

package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook7;

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);

        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}

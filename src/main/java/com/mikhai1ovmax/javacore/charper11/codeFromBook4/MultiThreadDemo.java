package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook4;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("one");
        new NewThread("two");
        new NewThread("three");
        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен .");
    }
}

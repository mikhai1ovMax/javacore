package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook7;

public class QIncorrectImplementation {
    int n;
    synchronized int get(){
        System.out.println("получено:" + n);
        return n;
    }
    synchronized void put(int n){
        this.n = n;
        System.out.println("отправлено: " + n);
    }
}

package main.java.com.mikhai1ovmax.javacore.charper28.twoSemafores;

public class ProdCon {
    public static void main(String[] args) {
        Q q = new Q();
        new Consumer(q);
        new Producer(q);
    }
}

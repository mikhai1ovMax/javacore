package main.java.com.mikhai1ovmax.javacore.task1;

public class Foo {
    int printedWords = 0;

    synchronized void printFirstWorld() {
        while (printedWords == 0) {
            first();
            printedWords = 1;
            notifyAll();
        }
    }

    synchronized void printSecondWorld() {
        while (printedWords <= 1) {
            if (printedWords == 1) {
                second();
                printedWords = 2;
                notifyAll();
                break;
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    synchronized void printThirdWorld() {
        while (printedWords <= 2) {
            if (printedWords == 2) {
                third();
                printedWords = 3;
                break;
            }
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void first() {
        System.out.print("first");
    }

    public void second() {
        System.out.print("second");
    }

    public void third() {
        System.out.print("third");
    }
}

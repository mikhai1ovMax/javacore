package main.java.com.mikhai1ovmax.javacore.task1;

import java.util.concurrent.Semaphore;

public class Printer implements Runnable {
    Semaphore semaphore;
    Foo foo;
    int wordNum;

    Printer(Semaphore semaphore, Foo foo, int wordNum) {
        this.semaphore = semaphore;
        this.foo = foo;
        this.wordNum = wordNum;
        new Thread(this).start();
    }


    @Override
    public void run() {
        try {
            semaphore.acquire();
            switch (wordNum) {
                case 1 -> {
                    if (foo.printedWords == 0) {
                        foo.first();
                        foo.printedWords++;
                    }
                    else{
                        semaphore.release();
                        run();
                    }
                }
                case 2 -> {
                    if (foo.printedWords == 1) {
                        foo.second();
                        foo.printedWords++;
                    }
                    else{
                        semaphore.release();
                        run();
                    }
                }
                case 3 -> {
                    if (foo.printedWords == 2) {
                        foo.third();
                        foo.printedWords++;
                    }
                    else{
                        semaphore.release();
                        run();
                    }
                }
            }
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

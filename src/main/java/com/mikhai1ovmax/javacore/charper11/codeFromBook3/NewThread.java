package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook3;

public class NewThread extends Thread {
    NewThread() {
        super("Демонстрационный поток");
        System.out.println("Дoчepний поток : " + this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток : " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен .");
    }
}

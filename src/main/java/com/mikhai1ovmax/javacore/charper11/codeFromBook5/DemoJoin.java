package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook5;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");

        System.out.println("first " + ob1.t.isAlive());
        System.out.println("second" + ob2.t.isAlive());
        System.out.println("third " + ob3.t.isAlive());

        try {
            System.out.println("ожидание завершения потоков");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Главный поток прерван.");
        }
        System.out.println("Главный поток завершен .");
    }
}

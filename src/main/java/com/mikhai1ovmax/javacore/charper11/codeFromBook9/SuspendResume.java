package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook9;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("pause thread 1");
            ob1.myResume();
            System.out.println("resume thread 1");

            ob2.mySuspend();
            System.out.println("pause thread 2");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("resume thread 2");
        }catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
    }
}

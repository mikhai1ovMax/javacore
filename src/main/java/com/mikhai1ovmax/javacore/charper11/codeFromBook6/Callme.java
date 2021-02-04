package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook6;

public class Callme {
     synchronized void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000) ;
        } catch ( InterruptedException е) {
            System.out.println("Пpepвaнo");
        }
            System.out.println("]") ;
    }
}

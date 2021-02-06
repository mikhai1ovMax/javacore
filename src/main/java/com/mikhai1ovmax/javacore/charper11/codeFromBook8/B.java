package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook8;

public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.foo()" );
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Клacc B прерван");
        }
        System.out.println(name + " пытается вызвать метод A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println(" B методе A.last() ");
    }
}

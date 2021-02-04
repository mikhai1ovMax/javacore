package main.java.com.mikhai1ovmax.javacore.charper11.codeFromBook4;

public class NewThread implements Runnable{
   String name;
   Thread t;

   NewThread(String name){
       this.name = name;
       t = new Thread(this, name);
       System.out.println("Hoвый поток : "+ t);
       t.start();
   }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println(name + "· "+ i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }
}

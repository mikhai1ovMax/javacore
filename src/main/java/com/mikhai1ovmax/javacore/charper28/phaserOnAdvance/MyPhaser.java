package main.java.com.mikhai1ovmax.javacore.charper28.phaserOnAdvance;

import java.util.concurrent.Phaser;

public class MyPhaser extends Phaser {
    int numPhases;

    public MyPhaser(int parties, int numPhases) {
        super(parties);
        this.numPhases = numPhases -1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("фаза " + phase + " завершена");
        if(phase == numPhases || registeredParties == 0)
            return true;
        return false;
    }
}

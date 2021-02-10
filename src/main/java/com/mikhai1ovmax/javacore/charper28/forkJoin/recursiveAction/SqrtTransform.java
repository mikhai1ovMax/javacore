package main.java.com.mikhai1ovmax.javacore.charper28.forkJoin.recursiveAction;

import java.util.concurrent.RecursiveAction;

public class SqrtTransform extends RecursiveAction {
    final int seqThreshold = 1000;

    double[] data;
    int start, end;

    public SqrtTransform(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if((end-start) < seqThreshold){
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        }else{
            int middle = (start + end)/2;
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}

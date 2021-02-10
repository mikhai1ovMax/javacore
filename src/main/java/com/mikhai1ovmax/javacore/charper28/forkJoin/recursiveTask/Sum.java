package main.java.com.mikhai1ovmax.javacore.charper28.forkJoin.recursiveTask;

import java.util.concurrent.RecursiveTask;

public class Sum extends RecursiveTask {
    final int seqThresHold = 500;
    double[] data;
    int start, end;

    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        }
        else {
            int middle = (start + end) /2;
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);
            subTaskA.fork();
            subTaskB.fork();
            sum = (Double) subTaskA.join() + (Double) subTaskB.join();
        }
        return sum;
    }
}

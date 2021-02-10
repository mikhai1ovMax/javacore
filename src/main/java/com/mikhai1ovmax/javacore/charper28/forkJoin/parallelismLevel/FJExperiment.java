package main.java.com.mikhai1ovmax.javacore.charper28.forkJoin.parallelismLevel;

import java.util.concurrent.ForkJoinPool;

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;
//        if (args.length != 2) {
//            System.out.println("Использование : FJExperirment параллелизм порог ");
//            return;
//        }
        System.out.println();
        pLevel = 4;
        threshold = 1000;

        long beginT, endT;

        ForkJoinPool forkJoinPool = new ForkJoinPool(pLevel);

        double[] nums = new double[1000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task = new Transform(nums, 0, nums.length, threshold);
        beginT = System.nanoTime();

        forkJoinPool.invoke(task);
        endT = System.nanoTime();

        System.out.println("Ypoвeнь параллелизма: " + pLevel);
        System.out.println("Порог последовательной обработки : " + threshold);
        System.out.println("Истекшее время : " + (endT - beginT) + " нс ");
    }
}

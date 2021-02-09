package main.java.com.mikhai1ovmax.javacore.charper28.forkJoin;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        double[] nums = new double[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }
        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
        forkJoinPool.invoke(task);
        for (int i = 0; i < 10; i++) {
            System.out.println(nums[i]);
        }
    }
}

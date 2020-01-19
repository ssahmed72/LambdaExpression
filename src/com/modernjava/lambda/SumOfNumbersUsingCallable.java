package com.modernjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallable {
    public static int[] array = IntStream.rangeClosed(0,5000).toArray();
    public static int total = IntStream.rangeClosed(0,5000).sum();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable callable1 = () -> {
            int sum=0;
            for (int i=0;i< array.length/2;i++){
                sum = sum + array[i];
            }
            return sum;
        };

        Callable callable2 = () -> {
            int sum = 0;
            for (int i=array.length/2; i<array.length;i++){
                sum = sum + array[i];
            }
            return sum;
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<Callable<Integer>> taskList = Arrays.asList(callable1, callable2);
        List<Future<Integer>> results = executorService.invokeAll(taskList);

        int k=0;
        int sum=0;
        for (Future<Integer> result: results){
            sum = sum + result.get();
            System.out.println("Sum of " + ++k + " is: " + result.get());
        }
        System.out.println("Sum from the Callable is: " + sum);
        System.out.println("Correct sum from InStream is: " + total);
        executorService.shutdown();

    }
}

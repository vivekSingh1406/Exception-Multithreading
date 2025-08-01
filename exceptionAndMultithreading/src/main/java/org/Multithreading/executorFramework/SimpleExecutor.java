package org.Multithreading.executorFramework;

import java.util.concurrent.*;

public class SimpleExecutor {

    public static int factor(int n) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        ExecutorService executor = Executors.newFixedThreadPool(3); // Pool of 3 threads
//
//        for (int i = 1; i < 10; i++) {
//            int finalI = i;  // Effectively final for lambda
//            Future<?> future = executor.submit(() -> {
//                int result = factor(finalI);
//                System.out.println("Factorial of " + finalI + " is " + result);
//            });
//        }
//
//        executor.shutdown();


        //  simple-Example
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<String> callable = () -> "vivek singh";
        Future<String> tempFuture = executorService.submit(callable);
        System.out.println(tempFuture.get());


        Future<String> future = executorService.submit(()-> "vivek singh bais");
        System.out.println(future.get());

        executorService.shutdown();
    }
}

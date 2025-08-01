package org.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CFReturnValue {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 5 * 5);

        System.out.println("Result: " + future.get());

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Running in separate thread: " + Thread.currentThread().getName());
        });


    }
}

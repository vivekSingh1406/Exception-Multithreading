package org.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class MultipleCompletableFutures {

    public static void main(String[] args) throws Exception {

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);
        CompletableFuture<String>  f3 = CompletableFuture.supplyAsync(()-> "vivek singh");


        CompletableFuture<Void> allOf = CompletableFuture.allOf(f1, f2, f3);

        allOf.join();
        System.out.println("Future1 Result: " + f1.get());
        System.out.println("Future2 Result: " + f2.get());
        System.out.println("Future2 Result: " + f3.get());
    }
}

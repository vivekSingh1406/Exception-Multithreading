package org.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CF2 {

    /**
    Handling Exception in CompletableFuture

    CompletableFuture provides methods like exceptionally and handle to handle exceptions
    and errors that might happen during asynchronous computation and provide a fallback
    value or perform some alternative operation.
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> resultFuture
                = CompletableFuture.supplyAsync(() -> 10 / 0)
                .exceptionally(ex -> 0);

        // 0 - returned by exceptionally block
        System.out.println(resultFuture.get());
    }
}

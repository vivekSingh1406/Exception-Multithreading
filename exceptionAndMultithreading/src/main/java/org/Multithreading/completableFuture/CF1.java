package org.Multithreading.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CF1 {

    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{

           try{
               Thread.sleep(4000);
               System.out.println("vivek singh bais");
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }

           return "vivek singh";
        });

        String temp = null;
        temp = completableFuture.getNow("ravi singh bais");
        System.out.println(temp);
        System.out.println(".................Start main method...............");
    }
}

package org.Multithreading.executorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableInterface {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(2);

        Future<Integer> submit = service.submit(()-> 1 + 2);
        Integer temp = submit.get();
        System.out.println("sum of two number "+ temp);
        service.shutdown();
        Thread.sleep(1);
        System.out.println(service.isTerminated());
    }
}

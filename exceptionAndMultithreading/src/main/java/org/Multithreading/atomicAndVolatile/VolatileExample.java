package org.Multithreading.atomicAndVolatile;

public class VolatileExample {

    private static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            while (running) {
                System.out.println("Working...");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Worker thread stopped.");
        });

        worker.start();

        // Main thread sleeps and then updates the flag
        Thread.sleep(2000);
        running = false;
        System.out.println("Main thread set running = false");
    }
}

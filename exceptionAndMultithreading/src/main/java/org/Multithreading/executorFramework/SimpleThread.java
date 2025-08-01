package org.Multithreading.executorFramework;

public class SimpleThread {


    public static int factor(int n) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int result = 1;
        for(int i=1;i<n;i++){
            result *= i;

        }
        return result;
    }
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Thread[] threads = new Thread[9];

        for(int i=1;i<10;i++){
            int temp = i;

            threads[i-1] = new Thread(
                    ()->{
                        long result = factor(temp);
                        System.out.println(result);
                    }
            );

            threads[i-1].start();
        }

        for(Thread thred  : threads){
            try{
                thred.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total time "+ (System.currentTimeMillis() - startTime));
    }
}

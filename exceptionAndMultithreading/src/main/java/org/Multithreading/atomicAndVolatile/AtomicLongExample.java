package org.Multithreading.atomicAndVolatile;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongExample {

    /**
        High-concurrency environments.
        To avoid synchronization overhead.
        Lock-free thread-safe operations on single variables or references.
     */

    public static void main(String[] args) {
        AtomicLong idGenerator = new AtomicLong(1000);

        long id1 = idGenerator.incrementAndGet(); // 1001
        long id2 = idGenerator.incrementAndGet(); // 1002
        long id3 = idGenerator.incrementAndGet(); // 1003
        long id4 = idGenerator.decrementAndGet(); // 1002

        System.out.println("Generated IDs: " + id1 + ", " + id2  +", " + id3 + ", " + id4);
    }
}

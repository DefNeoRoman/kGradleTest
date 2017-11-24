package com.task1;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public abstract class AbstractFactorialTest {

    private FactorialAlgorithm factorialAlgorithm;
    private final BigInteger testNumber = new BigInteger("30414093201713378043612608166064768844377641568960512000000000000");
    private final int numberInFactorial = 50;

    public AbstractFactorialTest(FactorialAlgorithm factorialAlgorithm) {
        this.factorialAlgorithm = factorialAlgorithm;
    }

    public static long bytesToMegabytes(long bytes) {
        return bytes / 1024L * 1024L;
    }

    @Test
    public void factorial() throws Exception {
        Runtime runtime = Runtime.getRuntime();

        long startTime = System.currentTimeMillis();
        assertEquals(testNumber, factorialAlgorithm.factorial(numberInFactorial));
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Time is: " + elapsedTime);
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory is bytes: " + memory);
        System.out.println("Used memory is megabytes: " + bytesToMegabytes(memory));
    }
}

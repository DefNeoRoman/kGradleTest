package com.task1;

import java.math.BigInteger;

public class LoopedFactorialImplementation implements FactorialAlgorithm {
    @Override
    public BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("x must be >=0);");
        if (n == 0) return BigInteger.ONE;
        BigInteger ret = BigInteger.ONE;
        for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i));
        return ret;
    }
}

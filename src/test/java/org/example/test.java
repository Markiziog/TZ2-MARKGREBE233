package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    @BeforeEach
    public void setUp() {
        Main.nums = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            Main.nums.add((long) (Math.random() * 1000000));
        }
    }

    @Test
    public void testMin() {
        long expectedMin = Main.nums.stream().min(Long::compare).orElseThrow();
        long actualMin = Main._min();
        assertEquals(expectedMin, actualMin);
    }

    @Test
    public void testMax() {
        long expectedMax = Main.nums.stream().max(Long::compare).orElseThrow();
        long actualMax = Main._max();
        assertEquals(expectedMax, actualMax);
    }

    @Test
    public void testSum() {
        long expectedSum = Main.nums.stream().mapToLong(Long::longValue).sum();
        long actualSum = Main._sum();
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testMult() {
        BigInteger expectedMult = Main.nums.stream()
                .map(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger actualMult = Main._mult();
        assertEquals(expectedMult, actualMult);
    }

    @Test
    public void performanceTest() {
        long startTime = System.nanoTime();
        Main._max();
        Main._min();
        Main._sum();
        Main._mult();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;
        System.out.println("Время выполнения всех операций: " + duration + " мс");
    }

    @Test
    public void scalabilityTest() {
        for (int size = 10000; size <= 100000; size += 10000) {
            Main.nums.clear();
            for (int i = 0; i < size; i++) {
                Main.nums.add((long) (Math.random() * 1000000));
            }
            long startTime = System.nanoTime();
            Main._mult();
            long endTime = System.nanoTime();
            long duration = (endTime - startTime) / 1_000_000;
            System.out.println("Размер: " + size + ", время выполнения _mult(): " + duration + " мс");
        }
    }
}

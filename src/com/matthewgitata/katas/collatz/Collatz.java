package com.matthewgitata.katas.collatz;

/**
 * The {@code Collatz} class outputs the length of the
 * Collatz Conjecture for any given number.
 * <p>
 * created by @matthewgitata on 09/01/2023
 */
public class Collatz {

    /**
     * @param x a positive natural number
     * @return the length of the Collatz Conjecture for {@code x}
     */
    public static long conjecture(long x) {
        int count = 1;
        while (x != 1) {
            if (x % 2 != 0) {
                x = (x * 3) + 1;
            } else {
                x = x / 2;
            }
            count = count + 1;
        }
        return count;
    }
}
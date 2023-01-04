package com.matthewgitata.katas.digitalroot;

/**
 * The {@code DigitalRoot} class contains a method to
 * find the recursive sum of all the digits
 * in a number.
 * <p>
 * created by @matthewgitata on 04/01/2023
 */
public class DigitalRoot {

    /**
     * Finds the recursive sum of all the digits in a number.
     *
     * @param n the number
     * @return the recursive sum of digits in {@code n}
     */
    public int digital_root(int n) {
        if (n < 0) {
            return -1;
        }
        if (n < 10) {
            return n;
        }
        int sum = n % 10 + digital_root(n / 10);
        return digital_root(sum);
    }
}
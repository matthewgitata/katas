package com.matthewgitata.katas.persistentbugger;

/**
 * The {@code Persist} class contains a method that takes in
 * a positive parameter and returns its multiplicative
 * persistence
 */
public class Persist {
    /**
     * Returns the multiplicative persistence of a number.
     *
     * @param n the number
     * @return the number of times you must multiply the digits in
     * {@code n} until you reach a single digit.
     */
    public static int persistence(long n) {
        if (n < 10) {
            return (int) n;
        }
        return ((int) n % 10) * persistence(n / 10);
    }
}
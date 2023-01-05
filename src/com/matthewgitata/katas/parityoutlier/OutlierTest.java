package com.matthewgitata.katas.parityoutlier;

/**
 * The {@code OutlierTest} class contains a method that performs
 * a parity test on an array of integers and returns the outlier -
 * a single integer that goes against the rest of the array elements.
 * <p>
 * created by @matthewgitata on 05/01/2023
 */
public class OutlierTest {
    public static void main(String[] args) {
        int[] sampleTest1 = {160, 3, 1719, 19, 11, 13, -21};
        System.out.println(find(sampleTest1));
    }

    /**
     * @param integers array of integers
     * @return a single integer which is the outlier in {@code integers}
     */
    public static int find(int[] integers) {
        int odds = 0;
        int evens = 0;
        for (int i = 0; i < 3; i++) {
            if (integers[i] % 2 == 0) {
                evens = evens + 1;
            } else {
                odds = odds + 1;
            }
        }
        if (odds > evens) {
            for (int integer :
                    integers) {
                if (integer % 2 == 0) {
                    return integer;
                }
            }
        } else {
            for (int integer :
                    integers) {
                if (integer % 2 != 0) {
                    return integer;
                }
            }
        }
        throw new IllegalArgumentException("No solution found.");
    }
}
package com.matthewgitata.katas.arraydiff;

import java.util.ArrayList;
import java.util.List;

/**
 * The {@code ArrayDiff} class contains a difference function
 * that subtracts one array list from another and returns
 * the result.
 * <p>
 * created by @matthewgitata on 06/01/2023.
 */
public class ArrayDiff {
    /**
     * Removes all values from list {@code a} that
     * are present in list {@code b}.
     *
     * @param a array list 1
     * @param b array list 2
     * @return list {@code a} with all the values present in
     * list {@code b} removed keeping their order.
     */
    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length != 0) {
            int count = 0;
            List<Integer> integerList = new ArrayList<>();
            for (int i : a) {
                for (int j : b) {
                    if (i != j) {
                        count = count + 1;
                        integerList.add(i);
                    }
                }
            }
            a = new int[count];
            int index = 0;
            while (index < count) {
                for (int j : integerList) {
                    a[index] = j;
                    index++;
                }
            }
            return a;
        }
        return a;
    }
}
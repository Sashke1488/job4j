package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < rsl.length) {
            if (j < left.length && k < right.length) {
                if (right[k] < left[j]) {
                    rsl[i] = right[k];
                    k++;
                } else {
                    rsl[i] = left[j];
                    j++;
                }

            } else if (k < right.length) {
                rsl[i] = right[k];
                k++;
            } else {
                rsl[i] = left[j];
                j++;
            }
            i++;
        }
        return rsl;

    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[]{1, 3, 5},
                new int[]{2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}

package ru.job4j.max;

public class Reduce {
    public int[] array;

    public int[] to(int[] array) {
        return array;
    }

    public void print(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print(array);
    }
}

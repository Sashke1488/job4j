package ru.job4j.condition;

public class Max {
    public static int maxLeft(int left, int right) {
        int resultLeft = left >= right ? left : right;
        return resultLeft;
    }

    public static int maxLeft(int first, int second, int third) {
        int resultLeft = maxLeft(maxLeft(first, second), third);
        return resultLeft;
    }

    public static int maxLeft(int first, int second, int third, int fourth) {
        int resultLeft = maxLeft(maxLeft(first, second), maxLeft(third, fourth));
        return resultLeft;
    }
}

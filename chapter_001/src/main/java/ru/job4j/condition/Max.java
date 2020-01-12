package ru.job4j.condition;

public class Max {
    public static int maxLeft(int left, int right) {
        int resultLeft = left > right ? left : right;
        return resultLeft;
    }
    public static  int maxRight(int left, int right){
        int resultRight = right > left ? right : left;
        return resultRight;
    }

    public static  int LeftEqualRight(int left, int right){
        int resultLeftEqualRight = left == right ? left : right;
        return resultLeftEqualRight;
    }
}

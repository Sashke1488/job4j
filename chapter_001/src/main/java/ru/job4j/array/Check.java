package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        boolean b = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != b) {
                return false;
            }
        }
        return result;
    }
}

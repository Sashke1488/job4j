package ru.job4j.array;


public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, 0, data.length);
            for (int j = 0; j < data.length; j++) {
                int index = FindLoop.indexOf(data, min, 0, data.length);
                if (data[i] < data[j]) {
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
        return data;
    }
}


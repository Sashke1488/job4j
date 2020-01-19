package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 1;
        while (ivan < nik ) {
            for (int i = 0; i < month; i++) {
                ivan *= 3;
                nik *= 2;
            }
            break;
        }

        return month;
    }
}

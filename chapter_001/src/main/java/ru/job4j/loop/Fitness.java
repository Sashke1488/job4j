package ru.job4j.loop;

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 2;
        while (ivan < nik || ivan > nik) {
            for (int i = 0; i < month; i++) {
                ivan *= 3;
            }
            break;
        }

        return month;
    }
}

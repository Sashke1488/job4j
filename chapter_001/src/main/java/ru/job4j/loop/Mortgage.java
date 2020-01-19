package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 2;
        while (amount < salary) {
            for (int i = 0; i < year; i++) {
                salary -= ((amount / 100) * percent) + amount;


            }
            break;
        }

        return year;
    }
}

package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        double percentPerYear = 1 + (percent / 100);
        while (amount > 0) {
            amount *= percentPerYear;
            amount -= salary;
            year++;

        }


        return year;
    }
}

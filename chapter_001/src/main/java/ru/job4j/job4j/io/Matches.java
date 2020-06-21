package ru.job4j.job4j.io;

import java.util.Scanner;

public class Matches {
    public static int chooseMatches(String player) {
        System.out.println(player + ", возьми спички от 1 до 3");
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());
        while (choice < 1 || choice > 3) {
            System.out.println("плохое количество спичек");
            choice = Integer.parseInt(input.nextLine());
        }
        return choice;
    }

    public static int counterMatches(int count, int input) {
        if (count - input < 0) {
            System.out.println("Не хватает спичек, возьмите поменьше");
        } else {
            count -= input;
            System.out.println("Остаток: " + count);
        }
        if (count == 0) {
            System.out.println("Игра закончена");
        }
        return count;

    }


    public static void main(String[] args) {
        String p1 = "Игрок 1";
        String p2 = "Игрок 2";
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        int matches = 11;
        while (matches > 0) {
            matches = counterMatches(matches, chooseMatches(p1));
            if (matches == 0) {
                System.out.println("Выиграл " + p1);
                break;
            }
            matches = counterMatches(matches, chooseMatches(p2));
            if (matches == 0) {
                System.out.println("Выиграл " + p2);
            }
        }
    }


}


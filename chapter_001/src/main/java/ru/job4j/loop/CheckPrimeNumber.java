package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        for (int i = 1; i <= finish; i++){
            if ((finish % i)== 0){
                prime =true;
            }
        }
        return prime;
    }
}
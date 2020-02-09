package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int endWord = word.length - 1;
        int endPost = post.length - 1;
        for (int i = 0; i < post.length; i++) {
            if (word[endWord - i] != post[endPost - i]) {
                result = false;
            }
        }
        return result;
    }
}

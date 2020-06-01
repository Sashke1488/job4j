package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {

        Book[] books = new Book[4];
        Book book = new Book();
        book.setName("Clean code");
        book.setCount(675);
        books[0] = book;

        book = new Book();
        book.setName("About Java");
        book.setCount(343);
        books[1] = book;

        book = new Book();
        book.setName("Modern Java Recipes. K. Kousen");
        book.setCount(321);
        books[2] = book;

        book = new Book();
        book.setName("Java Cookbook. 3 ed. I. F. Darwin");
        book.setCount(896);
        books[3] = book;

        for (Book bs : books) {
            System.out.println(bs.getName() + " - " + bs.getCount());
        }

        book = books[3];
        books[3] = books[0];
        books[0] = book;

        System.out.println("Change 0 and 3.");
        for (Book bs : books) {
            System.out.println(bs.getName() + " - " + bs.getCount());
        }

        System.out.println("Show only Clean code");
        for (Book bs : books) {
            if (bs.getName().equals("Clean code")) {
                System.out.println(bs.getName() + " - " + bs.getCount());
            }
        }
    }
}

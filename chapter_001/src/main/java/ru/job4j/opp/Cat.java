package ru.job4j.opp;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " " + "съел" + " " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Добряш");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Сиди дома");
        black.eat("fish");
        black.show();
    }
}

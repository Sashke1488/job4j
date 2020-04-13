package ru.job4j.opp;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok  = new Ball();
        Fox lisa = new Fox();
        Wolf volk = new Wolf();
        Hare scocer = new Hare();

        kolobok.getAway(lisa);
        volk.tryEat(kolobok);
        lisa.tryEat(kolobok);
        scocer.tryEat(kolobok);
    }
}

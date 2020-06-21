package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();

    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Enter item id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item found");
            System.out.println(item.toString());
        } else {
            System.out.println("Item not found");
        }
    }



}



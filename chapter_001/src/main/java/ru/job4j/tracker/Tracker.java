package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    public Item[] findByName(String key) {
        Item[] tmp = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i].getName().equals(key)) {
                tmp[i] = this.items[i];
                size++;
            }
        }
        return Arrays.copyOf(tmp, size);
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? this.items[index] : null;
    }
}
package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out){
        this.out = out;
    }

    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Find item by id");
        String id = input.askStr("Enter item id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Item found");
            System.out.println(item.toString());
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}

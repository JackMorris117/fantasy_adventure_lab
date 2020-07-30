package Player;

import Item.Item;

import java.util.ArrayList;

public abstract class Player {

    protected int health;
    protected ArrayList<Item> inventory;
    protected String name;

    public Player(int health, String name) {
        this.health = health;
        this.inventory = new ArrayList<Item>();
        this.name = name;
    }

    public int getHealth() {
        return this.health;
    }


    public ArrayList<Item> getInventory() {
        return this.inventory;
    }

    public String getName() {
        return this.name;
    }

}

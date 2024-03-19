package domain;

import java.util.ArrayList;

public class DVDshelf implements IShelf<DVD> {
    private String name;
    private int capacity;
    private ArrayList<DVD> dvds;

    public DVDshelf(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.dvds = new ArrayList<>();
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void addItem(DVD item) {
        dvds.add((DVD) item);
    }

    @Override
    public void removeItem(DVD item) {
        for (DVD dvd : dvds) {
            if (dvd.getName().equals(item.getName())) {
                dvds.remove(item);
            }
        }
    }

    public void printDVDshelf() {
        System.out.println(this.name + ":");
        for (DVD dvd : dvds) {
            System.out.println(dvd.toString());
        }
    }
}

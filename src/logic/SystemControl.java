package logic;

import domain.Bookshelf;
import domain.DVDshelf;

import java.util.HashMap;

public class SystemControl {
    private HashMap<String, Bookshelf> bookshelves;
    private HashMap<String, DVDshelf> dvdshelves;

    public SystemControl() {
        this.bookshelves = new HashMap<>();
        this.dvdshelves = new HashMap<>();
    }

    public void addBookshelf(String name, int capacity) {
        Bookshelf bookshelf = new Bookshelf(name, capacity);
        this.bookshelves.put(name, bookshelf);
    }

}

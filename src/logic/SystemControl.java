package logic;

import domain.Bookshelf;
import domain.DVDshelf;

import java.util.Collection;
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

    public void addDVDshelf(String name, int capacity) {
        DVDshelf dvDshelf = new DVDshelf(name, capacity);
        this.dvdshelves.put(name, dvDshelf);
    }

    public Collection<Bookshelf> getBookshelves() {
        return this.bookshelves.values();
    }

    public Collection<DVDshelf> getDVDshelves() {
        return this.dvdshelves.values();
    }
}

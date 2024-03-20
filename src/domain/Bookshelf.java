package domain;

import java.util.ArrayList;

public class Bookshelf implements IShelf<Book> {
    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Bookshelf(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void add(Book item) {
        books.add(item);
    }

    @Override
    public void remove(Book item) {
        for (Book book : books) {
            if (book.getName().equals(item.getName())) {
                books.remove(item);
            }
        }
    }

    public void printBookshelf() {
        System.out.println(this.name + ":");
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }


}

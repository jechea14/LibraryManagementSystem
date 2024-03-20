package domain;

public interface IShelf<T> {
    int getCapacity();
    void add(T item);
    void remove(T item);
}

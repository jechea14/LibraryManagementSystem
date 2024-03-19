package domain;

public interface IShelf<T> {
    int getCapacity();
    void addItem(T item);
    void removeItem(T item);
}

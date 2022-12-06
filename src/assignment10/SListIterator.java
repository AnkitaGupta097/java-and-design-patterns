package assignment10;

public interface SListIterator <T>{

    T next();
    boolean hasNext();
    void remove();
    void insert(T data);
}

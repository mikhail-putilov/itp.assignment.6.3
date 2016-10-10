package ru.innopolis.mputilov;

/**
 * Created by mputilov on 02/10/16.
 */
public interface Stack<T> {
    void push(T item);

    T pop();

    boolean isEmpty();

    T peek();
}

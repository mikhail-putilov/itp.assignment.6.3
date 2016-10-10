package ru.innopolis.mputilov;

import java.util.Arrays;

public class GenericStack<T> implements Stack<T> {
    private static final int DEFAULT_INITIAL_SIZE = 20;
    private GenericArray<T> arr;
    private int size;

    public GenericStack() {
        arr = new GenericArray<>(DEFAULT_INITIAL_SIZE);
    }

    public GenericStack(int initialSize) {
        if (initialSize < 1) {
            throw new IllegalArgumentException("initial size cannot be less than 1");
        }
        arr = new GenericArray<>(initialSize);
    }

    @Override
    public void push(T item) {
        if (size >= arr.length()) {
            enlargeMemory();
        }
        arr.set(size, item);
        size++;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from empty stack");
        }
        size--;
        return arr.remove(size);
    }

    private void enlargeMemory() {
        T[] memory = this.arr.getMemory();
        this.arr = new GenericArray<T>(Arrays.copyOf(memory, memory.length * 3 / 2 + 1));
    }

    @Override
    public boolean isEmpty() {
        return size < 1;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return arr.get(size - 1);
    }
}

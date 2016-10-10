package ru.innopolis.mputilov;

import java.util.Arrays;

public class GenericArray<T> {
    private T[] memory;

    public GenericArray(T[] memory) {
        this.memory = Arrays.copyOf(memory, memory.length);
    }

    @SuppressWarnings("unchecked")
    public GenericArray(int length) {
        this.memory = (T[]) new Object[length];
    }

    T[] getMemory() {
        return memory;
    }

    public int length() {
        return memory.length;
    }

    public T get(int index) {
        return memory[index];
    }

    /**
     * Set to null element with given index and return it
     *
     * @param index
     * @return
     */
    public T remove(int index) {
        T t = get(index);
        set(index, null);
        return t;
    }

    public void set(int index, T item) {
        memory[index] = item;
    }
}

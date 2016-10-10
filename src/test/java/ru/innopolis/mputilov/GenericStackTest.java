package ru.innopolis.mputilov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mputilov on 02/10/16.
 */
public class GenericStackTest {

    private GenericStack<Integer> stack;

    @Test
    public void simpleTest() throws Exception {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(new Integer(4), stack.pop());
        assertEquals(new Integer(3), stack.pop());
        assertEquals(new Integer(2), stack.pop());
        assertEquals(new Integer(1), stack.pop());
    }

    @Test(expected = IllegalStateException.class)
    public void throwExceptionIfUnderflow() throws Exception {
        stack = new GenericStack<>(3);
        stack.pop();
    }

    @Test
    public void doNotThrowExceptionIfOverflow() throws Exception {
        stack = new GenericStack<>(2);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        assertEquals(new Integer(4), stack.pop());
        assertEquals(new Integer(3), stack.pop());
        assertEquals(new Integer(2), stack.pop());
        assertEquals(new Integer(1), stack.pop());
    }
}
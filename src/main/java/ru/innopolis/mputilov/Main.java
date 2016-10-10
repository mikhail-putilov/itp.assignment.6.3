package ru.innopolis.mputilov;

/**
 * Created by mputilov on 02/10/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Initial stack size is 2");
        GenericStack<Integer> stack = new GenericStack<>(2);
        System.out.println("push elements: 1 2 3 4");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("pop elements:");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

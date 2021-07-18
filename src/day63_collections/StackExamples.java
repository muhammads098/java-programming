package day63_collections;

import java.util.Stack;

public class StackExamples {
    public static void main(String[] args) {
        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leaders eat last");
        bookStack.add("Java intro");
        bookStack.push("cucumber");
        System.out.println(bookStack);

        System.out.println("This is the top of the stack: "+bookStack.peek());

        System.out.println("Final version "+bookStack);



    }
}

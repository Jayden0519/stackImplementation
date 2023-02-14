import java.io.*;
import java.util.*;

public class Main
{
    static class Test
    {
        // Pushing the value on the top of the stack
        static void stackPush(Stack<Integer> stack)
        {
            for(int i = 0; i < 5; i++)
            {
                stack.push(i);
            }
        }

        // Displaying element on the top of the stack
        static void stackPeek(Stack<Integer> stack)
        {
            Integer element = (Integer) stack.peek();
            System.out.println("element display :) " + element);
        }

        // Searching element in the stack
        static void stackSearch(Stack<Integer> stack, int element)
        {
            Integer pos = (Integer) stack.search(element);

            if(pos == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element is found at position: " + pos);
        }


        public static void main (String[] args)
        {
            Stack<Integer> stack = new Stack<Integer>();

            stackPush(stack);
            stackPush(stack);
            stackPeek(stack);
            stackSearch(stack, 2);
            stackSearch(stack, 6);
        }
    }

}
package general.collections.list.stack;

import java.util.Stack;

public class StackExamples {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------- Exemple 1 --------------------------------------------------");
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);

        System.out.println("stack : "+stack); // [10, 15, 30, 20]
        System.out.println("pop the first element : "+stack.pop()); // 20
        System.out.println("pop the second element : "+stack.pop()); // 30
        System.out.println("stack after pop operations : "+stack); // [10, 15]

        System.out.println("peek the last element : "+stack.peek()); // 15
        System.out.println("stack after peek operations : "+stack); // [10, 15]

        System.out.println("search for an element position : "+stack.search(10)); // 2
        System.out.println("search for an element position : "+stack.search(15)); // 1

    }

}

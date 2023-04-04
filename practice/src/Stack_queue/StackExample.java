package Stack_queue;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> stacks = new Stack<>();
        stacks.push("Banana");
        stacks.push("Apple");
        stacks.push("Orange");
        stacks.push("Melon");

        System.out.println(stacks);

        System.out.println(stacks.peek());

        System.out.println(stacks.search("Banana"));

        System.out.println(stacks.get(1));
    }

}

package Stack_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue {

    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("1st");
        q.offer("2nd");
        q.offer("3th");
        q.offer("4th");

        System.out.println(q);

        System.out.println(q.peek());

        System.out.println(q.poll());
        System.out.println(q);

    }
}

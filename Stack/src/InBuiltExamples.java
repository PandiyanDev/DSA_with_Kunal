import java.util.*;

public class InBuiltExamples {
     static public void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//
//        stack.push(34);
//        stack.push(3);
//        stack.push(45);
//        stack.push(23);
//        stack.push(56);
//        stack.push(43);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(2);
//        queue.add(5);
//        queue.add(6);
//        queue.add(8);
//        queue.add(12);
//        queue.add(32);
//
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addFirst(34);
        deque.addLast(24);
        System.out.println(deque.removeFirst());

    }
}
public class QueueMain {
    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(4);
        queue.insert(5);
        queue.insert(7);
        queue.insert(10);
        queue.insert(12);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(99);
        queue.display();
    }
}

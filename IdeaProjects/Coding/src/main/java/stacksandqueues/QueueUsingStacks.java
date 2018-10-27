package stacksandqueues;
import java.util.*;

public class QueueUsingStacks {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public QueueUsingStacks() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void enqueue(int val) {
        s1.push(val);
    }

    public int dequeue() {

        if(s1.isEmpty()) {
            System.out.println("Queue is Empty");
            return -999;
        }

        if(s2.isEmpty()) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.dequeue());
        queue.enqueue(140);
        System.out.println(queue.dequeue());
        queue.enqueue(2);
        System.out.println(queue.dequeue());
        queue.enqueue(3);
        System.out.println(queue.dequeue());
        queue.enqueue(100);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(200);
        System.out.println(queue.dequeue());
        queue.enqueue(33);
        System.out.println(queue.dequeue());

    }
}

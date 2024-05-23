package Queue;


import java.util.Deque;

import java.util.LinkedList;

public class DoublyQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(2);
        dq.addLast(9);
        dq.addFirst(8);
        dq.addLast(7);
        dq.addLast(6);
        dq.addLast(4);
        dq.addLast(3);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
        dq.removeFirst();
        dq.addFirst(89);
        System.out.println(dq);
        System.out.println(dq.getFirst());// first se jo 4 hoga usko delete karega
        dq.removeFirstOccurrence(9);
        System.out.println(dq);
        dq.removeLastOccurrence(4);// last se jo 4 hoga usko delete karega
        System.out.println(dq);
    }
}


// ham queue ma ek taraf se add or dusri taraf se remove kar rahe the
// doubly ended queue ma ma dono taraf se add remove kar sakta hu
// or accessed kar sakta hu
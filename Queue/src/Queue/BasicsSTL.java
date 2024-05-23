package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicsSTL {
    public static void main(String[] args) {
       // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> w = new LinkedList<>();
        w.add(1);
        w.add(2);
        w.add(3);
        w.add(4);
        w.add(5);
        System.out.println(w);
        w.remove();
        System.out.println(w);
        w.poll();//pop
        System.out.println(w);
        System.out.println(w.peek());
        System.out.println(w.isEmpty());
    }
}

// queue is like storing element in pipe
// jisko phele dala usko phele nikalege
package Queue;


import java.util.LinkedList;
import java.util.Queue;
// print all the element present in the queue only usingadd remove peek size & using extra queue
public class Ques {
    public static void main(String[] args) {
        Queue<Integer> w = new LinkedList<>();
        Queue<Integer> helper = new LinkedList<>();
        w.add(1);
        w.add(2);
        w.add(3);
        w.add(4);
        w.add(5);
        System.out.println(w);
         while(w.size()>0){
             System.out.print(w.peek() + " ");
             helper.add(w.poll());//poll = pop
        }
         while(helper.size()>0){
             w.add(helper.poll());
         }
    }
}

// mere ek queue ma element ha phele ma print kara duga phir dusra ma dal queue ma duga
// jo hmara nporma l queue print hota ha vo dusra queue ka use kar ke he hota ha





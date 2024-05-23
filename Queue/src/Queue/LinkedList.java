package Queue;

public class LinkedList {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x) {
            Node temp = new Node(x);

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = tail.next;
            }
            size++;
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val);
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueLL w = new queueLL();

        w.add(1);
        w.add(2);
        w.add(3);
        w.add(4);
        w.add(789);
        w.display();
        w.remove();
        w.display();
        System.out.println(w.peek());
    }
}


// linkedlist representation oof queue
// ma queue ko represent karuga linked list se

// queue ma jo phela element ma dal rha hu vo he mera phele delete hoga or vo he peek par hoga usko mana head bol diya
// or jaha se ma element add kar raha hu vo tail
//
// queue      5  4  3   2  1
//            t            h
// 1 ko ma phele delete karuga or 5 mera last element ha jo add hua hoga

// head represent the peak of queue or jaha se ma element delete kar raha hu and tail is where  i add the emlent
// linked list

// 1->2
// h  tail
// h ko tail se point or jab element add karuga tail = tail.next
// for pop h = h.next
// for add ek new node temp => tail.next = tmp
// tail = tail.next










package LinkedList;
// find the length of list method 2
public class LengthMethod2 {
    public static class Node{
        int data;
        Node next;
        Node(int data){// constructor
            this.data = data;
        }
    }

    public static class LinkedList {
         Node head = null;
        Node tail = null;

        int size = 0;

        void insertAtStart(int val) {// function => esma ham val add karege list ka end me
            Node temp = new Node(val);// ek new node bana diya temp ka name se or uska andar val dal de
            // if my list is empty mana ek node banaya temp name se or usma 1 de deya vo he head ha or vo he temp
            if (head == null) {// if list is empty head or tail dono ko temp man lege  jo hmna new node banaya ha
                head = temp;
                tail = temp;
            } else {// if list is filled
                // temp  a b c d e
                temp.next = head;
                head = temp;
            }
            size++;
        }


        void insertAtEnd(int val) {// function => esma ham val add karege list ka end me
            Node temp = new Node(val);// ek new node bana diya temp ka name se or uska andar val dal de
            // if my list is empty mana ek node banaya temp name se or usma 1 de deya vo he head ha or vo he temp
            if (head == null) {// if list is empty head or tail dono ko temp man lege  jo hmna new node banaya ha
                head = temp;
                tail = temp;
            } else {// if list is filled
                // a b c d e temp   my tail is e jo ki temp ka add hone se phele null ko point kar rahe thi par ab ma chata hu ki tail temp ko point kare jese mera a , b ko point kar raha ha kyuki a.next ka andar b ka adress ha a.next = b
                tail.next = temp; // e.next ka andar temp ka adress a gaye matlab ab e temp ko point kar raha ha
                tail = temp; // ab temp mera last node ha to usko mana tail ma dal diya
            }
            size++;
        }

        void insertAtidx(int idx, int val) {
            Node N = new Node(val);// jo hmari new value ha uska lie ka new node to chahiye na or us node ka name t
            Node temp = head;// head ko temp ma dal diya or esko idx-1 par le gyege
            if (idx == size) {// matlab ham last ma elementadd karna chatah ha to insertatend chala dege
                insertAtEnd(val);
                return;
            } else if (idx == 0) {// eska matlab ma starting ma element add karna chata hu ti insertatstart karuga
                insertAtStart(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return;
            }
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;// temp ko ham head se idx-1 par le gaye
            }
            N.next = temp.next;// description in below the code
            temp.next = N;
            size++;
        }

        int getAt(int idx) {// es idx par node niklana ha
            if (idx < 0 || idx > size) {
                System.out.println("wrong index");
                return -1;
            }
             Node temp = head;// temp ko head par point kar diya
            for (int i = 1; i <= idx; i++) {
                temp = temp.next;// ma temp ko idx par le gaya jiska node chahiye or us temp ko aagle node sa join kar diya
            }
            return temp.data;

        }

        void display() {// we don't neded to receive an arguement because it is apart of linkedlist class
             Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

//        int size() {
//             Node temp = head;
//            int count = 0;
//            while (temp != null) {
//                count++;
//                temp = temp.next;
//            }
//            return count;
//        }
    }
    public static void main(String[] args) {
         LinkedList l1 = new LinkedList();
        l1.insertAtStart(6);
        l1.insertAtStart(8);
        l1.insertAtStart(5); // 5 8 6
        l1.insertAtidx(2,900); // 5 8 900 6
        System.out.println();
        l1.insertAtidx(0,100);
        l1.insertAtidx(5,100);
        System.out.println(l1.tail.data);
        System.out.println(l1.head.data);
        l1.display();
        System.out.println();
        System.out.println(l1.getAt(3));// 3 index par jo node ha vo mil gaye
        System.out.println("size of list : "+ l1.size);

    }
}

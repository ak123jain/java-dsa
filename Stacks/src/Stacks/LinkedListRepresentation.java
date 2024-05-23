package Stacks;

public class LinkedListRepresentation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class Stack{// user defined data structure
         private Node head = null;
        private int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        void displayRecursion(Node head){/// recursion ma arguement hota he ha
            if(head==null) return;
            displayRecursion(head.next);// reverse ka liye phele call phir print
            System.out.print(head.val + " ");
        }

        void display(){
            displayRecursion(head);
        }
        void displayRev(){// ye mera ulti list print kar raha ha recursion ka through sidha karta hu
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val +" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){// getter
            return size;
        }

        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;// jo value pop kari usko reserve kar liya
            head = head.next;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        System.out.println("size "+ st.size());
        st.pop();

        st.display();//
        System.out.println(st.isEmpty());
    }
}

// LinkedList implementation of stack

//sabse pheel ek null banaya or us par head point kar diya
//jab bhi ham st.push(5) to ek new node banaga temp name se

//                 5    null
//                temp  head
//or new node banagi temp name se
// phir temp ko link karuga temp.next = head or head = temp

//                 5  -> null
//                head

 // st,push(67)

//         67        5  ->  null
//         temp     head

// temp.next = head , head = temp

//         67    ->   5  ->  null
//        head

//jo element mana sabse phele dala stack me vo list ma mera piche chala gaya kyuki ma ma list head se null print karta hu
// to ma list ulti display karuga

// ADVANTAGE OF  ARRAY IMPLEMENTATION OF stack

// 1 size -> for every element -> space taken is one block

// array ma har element  ek block ka space he letabha

// agar mereko fixed size ka stack rakhna ha to ma array se bana sakta hu kyuki array ka size fix hota ha

//  DISADVANTAGE OF  ARRAY IMPLEMENTATION OF stack

// 1 size -> fixed -> overflow array ma to size fixed ha lekin mana stack ma multiple element add kar diya to stack overflow
// 2 if size = 100  to muje 100 full karna padege


// ADVANTAGE OF  linkedlist IMPLEMENTATION OF stack
// unlimited size

// DISADVANTAGE OF  ARRAY IMPLEMENTATION OF stack

// size -> do data nember
// display -> reverse jab ham display function use karta ha to reverse ma list print hoti ha
// space complexity 0(n)
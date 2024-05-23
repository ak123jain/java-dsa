package LinkedList;
// inser element at the end of the list
public class Implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){// constructor
            this.data = data;
        }
    }

    public static class LinkedList{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int val){// function => esma ham val add karege list ka end me
            Node temp = new Node(val);// ek new node bana diya temp ka name se or uska andar val dal de
             // if my list is empty mana ek node banaya temp name se or usma 1 de deya vo he head ha or vo he temp
           if(head==null){// if list is empty head or tail dono ko temp man lege  jo hmna new node banaya ha
               head = temp;
               tail = temp;
           }else{// if list is filled
               // a b c d e temp   my tail is e jo ki temp ka add hone se phele null ko point kar rahe thi par ab ma chata hu ki tail temp ko point kare jese mera a , b ko point kar raha ha kyuki a.next ka andar b ka adress ha a.next = b
               tail.next = temp; // e.next ka andar temp ka adress a gaye matlab ab e temp ko point kar raha ha
               tail = temp; // ab temp mera last node ha to usko mana tail ma dal diya
           }
        }
        void display(){// we don't neded to receive an arguement because it is apart of linkedlist class
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return  count;
        }
    }

    public static void main(String[] args) {
        // ma linked list ko arraylist ki tarah likhna chata hu or uski tarah method apply karna chahatu hu
     LinkedList l1 = new LinkedList();
     l1.insertAtEnd(1);
     l1.insertAtEnd(56);
     l1.display();
     System.out.println();
     System.out.println("size of list : "+ l1.size());
    }
}

// a b c d e temp   my tail is e jo ki temp ka add hone se phele null ko point kar rahe thi par ab ma chata hu ki tail temp ko point kare jese mera a , b ko point kar raha ha kyuki a.next ka andar b ka adress ha a.next = b
//            tail.next = temp; // e.next ka andar temp ka adress a gaye matlab ab e temp ko pont kar raha ha
//                    tail = temp; // ab temp mera last node ha to usko mana tail ma dal diya

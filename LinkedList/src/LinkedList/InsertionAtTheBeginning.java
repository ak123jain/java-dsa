package LinkedList;

public class InsertionAtTheBeginning {
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
        void insertAtStart(int val){// function => esma ham val add karege list ka end me
            Node temp = new Node(val);// ek new node bana diya temp ka name se or uska andar val dal de
            // if my list is empty mana ek node banaya temp name se or usma 1 de deya vo he head ha or vo he temp
            if(head==null){// if list is empty head or tail dono ko temp man lege  jo hmna new node banaya ha
                head = temp;
                tail = temp;
            }else{// if list is filled
                // temp  a b c d e
                temp.next = head;
                head = temp;
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
        LinkedList l1 = new LinkedList();
        l1.insertAtStart(1);
        l1.insertAtStart(56);
        l1.display();
        l1.insertAtStart(786);
        System.out.println();
        l1.display();
        System.out.println();
        System.out.println("size of list : "+ l1.size());
    }
    }


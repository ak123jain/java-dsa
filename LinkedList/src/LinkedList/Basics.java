package LinkedList;

public class Basics {

    public static class Node{
        int data;// int ->  data type (value)
        Node next;// node is our data type and next is our adress next jisma ma next node ka adress store kar raha hu
        Node(int data){// constructor
            this.data = data;
        }
    }
    public static void main(String[] args) {
     //Basics sc = new Basics();// we can make obj of any class using new keyword
        Node a = new Node(6);// all are obj || a node ka left ma data store kar diya
        Node b = new Node(3);//
        Node c = new Node(5);
        Node d = new Node(9);
        Node e = new Node(0);
        // a.next ka andar b ka adress store ho raha ha to vo dono aapas ma link ho gaye
        a.next = b;
        b.next = c;// 6 -> 3 -> 5
        c.next = d;// 6-> 3 -> 5 -> 9
        d.next = e; // 6-> 3 -> 5 -> 9 -> 0 list are connected through adress or agar mana link kar diya to ma ab kisi ka bhi data accessed kar sakta hu
     }
}

// (a.next =  b) a node andar b ka adress store ho gya
// INSERTION IN LINKED LIST
// idx      0    1    2    3    4
// node     5 -> 3 -> 6 -> 8 -> 9

//i want to insert add an element in list to idx no 2 -> 10 element

//to ma 10.next ka andar 6 ka adress dal duga or 3 or 6 aapas ma jo connection(3.next=6) ha vo ma tod duga 3.next = 10 esma ma 10 ka adress dal duga

// drawback in linked list => agar muje last element ko accessed karna ha oe phela element given ha to uska paas second element ka adress ha to muje vaha jana padega phir next ongoing pure list travel karni padegi kyuki adress line wise linked ha
// a -> b > c -> d
// man lete ha d element accessed accessed karna ha to phele muje b ka pass jana padega phir b se c or phir c sa d
// kyuki a ka paas b ka adress ha d ka nahi
// par array ma ham kisi bhi element ko accessed kar sakta ha



//IN ONE LINE => ek node ke => do attribute(properties) => en attribute ko ham kisi data type ka through store kar rahe ha usma se phela data type int ha or dusra Node

// node(5) =>  5  x555 ||  3  y600 ||  9   x700  ||  8  y440  || 16  null
// adress       x500        x555        y600          x700         y440

// linked list ma element ko node bolte ha ek node ka do attribute ek int data type or dusra data type me ma dusri node ka adress
// ek node ka andar left ma int data type or right ma node data type ab samaj int data type data ko store kar raha ha or node data type adress ko store kar raha ha  or us adress ko next bol rahe ha or vo adress pure node ka nahi node ka right part ka adress
package Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayImplementation {
    public static class queueA{
        int f = -1;
        int r = -1;
        int [] arr = new int[5];
        int size = 0;
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            // agar f=-1 ha to array khali ha to f = 0 r = 0
            // f==-1 matlab size==0 tab f = 0 r = 0 par hoga size 0 esliye nahi likh sakte kyuki agar aaga jake array ka size 0 hua to f or r 0 par aa gaye ge
            if(f==-1){ // size ==0
                f = r = 0;
                arr[0] = val;
            }
            else{// add element
                arr[r+1] = val;
                r++;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[f];// front se delete karuga usko x ma store kiya
            f++;
            size--;
            return f;
        }
        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
            }
            else{
                for(int i=f;i<=r;i++){
                    System.out.println(arr[i]+ " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA w = new queueA ();

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

// Array Implementation of queue
// array se queue ki implementation
//
// queue ma jo phela element ma dal rha hu vo he mera phele delete hoga or vo he peek par hoga usko mana head bol diya
// or jaha se ma element add kar raha hu vo tail
//
// queue      5  4  3   2  1
//
// queue ma ma 1 ko phele delete kar sakta hu or 5 mera last element ha jo add hua hoga
//
//  to array ma mana mana 1 dala to muje us he ko phele delete karna ha
// array  1  2
// 1 is my peak element and or 1 ko he ma phele delete karna chahata hu or 1 ka baad ma element add karta rahuga jese 2 3 4
// or 2 se ma element add karuga
// to mana front or rear bana diya front se ma delete karuga or rear se add
// 1 2 3 4 5
// f
// r
//
// f = -1 , r = -1
// array 1
//       f
//       r

// f = -1 , r = -1
// jab ma phele element add karuga to f = 0 , r = 0 -1 se autha kar
// jab add karuga to arr[r+1] ma karuga or rear ko r++ duga
// jab array ma elementa add karuga r++ or jab remove karuga tab f--
// kykui jab ma element nikaluga tab front se nikaluga

// front se add or rear se delete

//













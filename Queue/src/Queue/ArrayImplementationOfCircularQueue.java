package Queue;

public class ArrayImplementationOfCircularQueue {
    public static class Cqr{
        int f = -1;
        int r = -1;
        int size = 0;// queue
        int arr[] = new int[9];
        public void add(int val){
            if(size== arr.length) {// queue ka size
                System.out.println("queue is full");
            }
             else if(size==0){// queue ka size 0
                 f = r = 0;
                 arr[0] = val;
             }
             else if(r<arr.length-1){
                arr[r+1] = val;
                r++;
            }
             else if(r== arr.length-1){// if queue ko mana aaga se bhar diya to rear ko phir se picjhe le jyuga
               r = 0;
               arr[0] = val;
            }
             size++;
        }
        public int remove() {
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            else if(f==arr.length-1) {// kyuki ab rear to aage hoga to queue yahi se start hoga => pura queue pop karka f == arr.length
                int val = arr[f];
                f = 0;// 0 par le auga last vala aapna aap delete ho jyega
                return val;
            }
            else{// agar front kahi beech ma ha
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }
        public int peek() {
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            else return arr[f];
        }

        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
           else if(f<=r){
               for(int i=f;i<=r;i++){
                   System.out.println(arr[i]);
               }
           }
           // queue jo hoti ha vo front se rear tak hoti ha ab chahe front aage ho ya peche or rear aag ho ya peeche
            else if(r<=f){// bcoj of circular queue
                for(int i=f;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
                for(int i=0;i<=r;i++){
                    System.out.println(arr[i]);
                }
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Cqr w = new Cqr();
        w.display();
        w.add(1);
        w.add(2);
        w.add(3);
        w.add(4);
        w.add(789);
        w.display();
        w.remove();
        w.display();
        System.out.println(w.peek());
        System.out.println(w.size);
    }
}

//ArrayImplementation Of Circular Queue

// implementation of queue using array
// length of queue = n

// f = r = -1
// when i adding element then then f = r = 0

//                        n-1
// 1  2  3  4  5  6  7  8  9
// f                       r

// mana pure queue ma element add karta karta rear ko n-1 par le aaya
// phor ma jab element delete karuga 1 2 3 4 5 6 to f 7 par aa gaya

// 1  2  3  4  5  6  7  8  9
//                   f     r

// f ka piche ka element khali page ha
//ab ma element piche se add karuga
// if(r==n-1)
//   arr[0] = X
//    r = 0
// jab mene dekha piche se queue khali ha to piche se bharna shuru jab element add karta ha to r++ lekin rear == arr.length-1 ho gaya esliye r = 0

// 1  2  3  4  5  6  7  8  9
// r                 f

// jab bhi element add karuga r++

// if(size==0){
//  f = r = 0;
//  arr[0] = X;
//  }
//else if(size==n){
//    sout("queue is full");
//        }
//else if(r < n-1){
//    arr[r+1] = x;
//    r++;
//        }

// 1 2 3 4
// f     r
// arr[r+1] = X
// r++

//else if(r==n-1){
//    r = 0;
//    arr[0] = X;
//        }

// 1  2  3  4  5  6  7  8  9
// r                       f

//remove
//else if(f==n-1){
//    int val arr[f];
//    f = 0;
//    return val;
//        }
// jab rempove karta hu tab f ko f++ par jab f = n-1 tab f = 0

//else{
//    int val = arr[f];
//    f++;
//    return val;
//        }


// vese to mera f aaga rheta ha rear se par circular queue ki vaji se aage piche ho gata ha




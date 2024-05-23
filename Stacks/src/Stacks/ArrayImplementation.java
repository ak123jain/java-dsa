package Stacks;

public class ArrayImplementation {

    public static class Stack{// ab stack array ha mera ma stack ko implement kar raha hu array ka through

        private int[] arr = new int[6];
        private int idx = 0;
        void push(int x){// yaha par mera idx size bhi bata raha ha
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx] = x;// ek elemenet push karna ka baad ham idx bada dege esme  => yaha idx mera size bhi bata raha ha kyuki ma jab bhi element add karuga to idx bhi bade ga idx == size
            idx++;//
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];// ma sirf 1 ko he pop kar sakta hu kyuki vo top par ha or usko mana autha liya
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }

        boolean isEmpty(){// size == idx
            if(idx==0)  return true;
            else return false;
        }

        boolean isFull(){// size == idx
            if(idx== arr.length)  return true;
            else return false;
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
        System.out.println(st.isFull());
    }
}

// Array implementation of stack = stack ka implementation array ka through
// stack bana rahe ha using array = vo dikhaga array ki trah par vo ha stack


// arr  4  5  1
//               idx
//idx = 0  1  2  3  4  5
// agar mereko peak vala element chahiye to ma arr[idx-1] karuga kyuki mana phele 4 dala phir 5 1



// size jo mera idx ha vo he size kyuki idx 0 se shuru hota ha
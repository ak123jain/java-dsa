package Queue;

public class ImplementStack {
    public static void main(String[] args) {

    }
}

// implemenent stack using given queues
//             |                |
//           push               add
//            pop               remove
//           peek               peek

// esko ham do queue ek help se karta ha

// q1
//      given queue 1  2  3  4
// add element in queue
// q1 1  2  3  4
// 1 is my peek and 4 is last
// but in stack
//4
//3
//2
//1
// 4 is my peek hona chahiye par queue ma to  mera peek 1 ha to ma queue ma last element chod kar (4) baki remove karka jo peek par hoga 4 usko get kar lege  piche se add kar duga usi queue ma


//void push(int val){
//    q1.add(val);
//}
//int peek(){
//    for(int i=0;i<peek.size()-1;i++){
//        q1.add(q1.remove); jo remove kara us he ko piche se add kar dege
//    }
//}
// int x =  q1.peek();
//  q1.add(q1.remove);
// return x;

// 4  1  2  3
// 4 is my peek
// phir se 1 2 3 4 ki form ma le aayege
// q1.add(q1.remove);

// for pop
// muje 4 ko pop karuga in stack ma to
// but in queue phele muje 1 2 3 ko hatana padega


// in these push TC -> 0(1)
//          peek TC -> 0(n)
//          pop  TC -> 0(n)

// ab muje pop ki TC 0(1) ma karni ha
// to push ki aapna aap 0(n) ma hogi es baar aasa nahi ho sakta dono 0(1) ma ho gaye


// 1  2  3  4
//

// q1 remove  1  2  3  4  add
//   par muje to 4 ko pop karna ha kkyuki agar ma stack ma hota to 4 he pop hota
// phela element to aase he dal duga jab stack khali hoga jab khali nahi hoga tab ye sab karuga
// q1 remove 1  2  add
//  2  1 kar duga
// q1 remove 2  1  3   add
// 3  2  1  => 2 or 1 ko peeche le auga
// q1 remove 3  2  1  4  add
//  4  3  2  1

// q1 remove    4 3  2  1 add
// ab ma 4 ko pop kar luga

// ab peek or pop 0(1) ma ho gaye lekin push 0(n)

















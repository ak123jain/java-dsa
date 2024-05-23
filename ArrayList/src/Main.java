import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static class Arraylist{// through constructor ma array ka size de duga
     int[] arr1 = new int[4];
     int idx = 0;
     int size = 0;
     public void add(int element){

         if(size== arr1.length){// ab yaha par jitna mera aaray ka size hoga ma utna he eleemnt add kar sakta hu par ma chata hu ki jese he mera aaray bhar jaye to ek new double size ka aary create ho gaye or old elelent copy ho gaye
             int [] brr = Arrays.copyOf(arr1,arr1.length*2);
             arr1 = new int [brr.length];
             int [] arr1 = Arrays.copyOf(brr,brr.length*2);
         }
         arr1[idx] = element;// 0 th idx par phela eleemnet add ho gaya
         idx++;
         size++;
     }

     public void set(int idx, int value){
         arr1[idx] = value;
     }

    }
    public static void main(String[] args) {
        Arraylist arr1 = new Arraylist();// creating an obj or ma chahatu hu ki ye bnta he 5 size ka array create ho gaye

        arr1.add(2);
        arr1.add(56);
        arr1.add(2);
        arr1.add(2);



        System.out.println(arr1.size);
        arr1.add(786);
        System.out.println(arr1.size);

        arr1.set(0,345);// 0 idx par elmt change

        System.out.println(arr1.size);


        //ArrayList<Integer> arr = new ArrayList<>(4);
        // ma size dana ka badd mi elemnt add kar sakta hau
        // Arraylist grow kar sakti ha
//        arr.add(1);// we can add  element in arraylist
//        arr.add(2);
//        arr.add(3);
//        arr.add(567);
//        arr.add(8748);
//        arr.add(1);
//        arr.add(7446);
//        arr.set(3,9);//we can change the value
//        System.out.println(arr);
//        System.out.println(arr.size());
    }

    // let take the size of arraylist is 4 and when the arraylist is full with element then arraylist automatically double its size  = 8 or jese he 8 size wala array bhar jyega to vo double size ka arrylist phir bana dega
}
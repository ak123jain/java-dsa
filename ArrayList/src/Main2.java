
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // wrapper class =, Integer , Float ,character ,Boolean
        Integer i = Integer.valueOf(4);//wrapper class ka object
        // integer ki value ko declare karna ka dusra method bcoz java is an object oriented programming
        //instead of int i = 4;
        System.out.println(i);
        Float f = Float.valueOf(4.5f);
        System.out.println(f);

        //int  a[] = new int[n]; es array ka size ko declare karna ka baad ham chage nahi kar sakte
        // so we take  next method

        ArrayList<Integer> l1 = new ArrayList<>();
       // array ka size ko declare karna ka new method esma ham size change kar sakte ha

//        ArrayList<Boolean> l2 = new ArrayList<>();
//        ArrayList<Float> l3 = new ArrayList<>();

         l1.add(5); // element add karna ka liye
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // kese bhi index par element access karna ha
        System.out.println(l1.get(1));// 1 index par element access karne ka liye

        // print array using for loop
//        for( i=0;i<l1.size();i++){
//            System.out.println(l1.get(i));// 5,6,7,8
//        }

        //print array directly
        System.out.println(l1);// [5,6,7,8]

        // kisi index par element add karne ka liye
        l1.add(1 ,100);
        System.out.println(l1);//[5,100,6,7,8]

        //change element at index i
        l1.set( 1 , 10); // 1 index par element change kar diya 100 sa -> 10
        System.out.println(l1);

        // remove an element at index i
        l1.remove(1);
        System.out.println(l1);// [5,6,7,8]

        // remove an element e jab hma index na pata ho
        l1.remove(Integer.valueOf(7));// sidha element ko remove kar diya
        System.out.println(l1);


        // checking if the element exist
         boolean ans = l1.contains(Integer.valueOf(80));
         System.out.println(ans);
         
         // if you don't specify class . you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("akash");
        l.add(1);
        l.add(true);

        System.out.println(l);



    }
}

import java.util.ArrayList;
import java.util.Collections;// es file sa sort or reverse direct kar sakte ha

public class ReverseArray {

    static void reverselist(ArrayList<Integer> l1){
       int i = 0 , j = l1.size() - 1;

       while(j > i){
           /*
           int temp =a;
           a = b;
           b = temp;
            */
           Integer temp = Integer.valueOf(l1.get(i));// integer ko declare kar diya
           l1.set(i , l1.get(j));
           l1.set(j , temp);

           i++;
           j--;
       }
    }
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();// array size

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        System.out.println("original list" +l1);
        Collections.reverse(l1);// direct reverse bhi kar sakte ha using import
        //reverselist(l1);
        System.out.println("reversal list" +l1);
        Collections.sort(l1);
        System.out.println("sorted in ascending order " +l1);

        Collections.sort(l1 ,Collections.reverseOrder());
        System.out.println("sorted in descending order " +l1);


        ArrayList<String> l2 = new ArrayList<>();

        l2.add("welcome");
        l2.add("to");
        l2.add("physics");
        l2.add("wallah");
        System.out.println("original list" + l2);

        Collections.sort(l2);
        System.out.println("sorted in ascending order " +l2);

        Collections.sort(l2 ,Collections.reverseOrder());
        System.out.println("sorted in desending order" + l2);

    }
}

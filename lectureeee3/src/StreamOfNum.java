//import java.util.Scanner;
//print the sum of stream of integer in the input
//public class StreamOfNum {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
    // hum jo bhi input la raeh ha uska sum karana ha par jab ham -1 lege tab nahi karna
//        int num = sc.nextInt();
//        int sum = 0;
 //       while(num != -1){
  //          sum += num;
 //           num = sc.nextInt();
 //       }
 //       System.out.println(sum);// jaha hmara num -1 ka equal ho gaye vaha  sum print ho gyega
//    }
//}
 import java.util.Scanner;
//print the sum of stream of integer in the input
public class StreamOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        do {
            sum += num;
            num = sc.nextInt();// jo hmane user sa input liya vo ya niche vali condition check karega
        } while (num != -1);
        System.out.println(sum);
    }
}
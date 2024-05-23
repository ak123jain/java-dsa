//import java.util.Scanner;
//// print all the value between 1 and 50 except for teh multiple of 50 ?
//public class ContinueKeyword {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        myloop : for(int num=1;num<=50;num++){
//            if(num % 3==0){
//                continue myloop;
//            }
//            System.out.println();
//
//
//        }
//
//    }
//}

import java.util.Scanner;
//print all the value between 1 and 50 except for teh multiple of 50 ?
public class ContinueKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        while(num<=50){
            if(num % 3 == 0){
                num++;// ya num ++ esliye lagaya kyuki if ki condition chalna ka baad  niche vali 29 or 30 vali line nahi chal rahi thi esliye hmna num ki
                // value phele hi bada di taki if ki condition hit na kare
                continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
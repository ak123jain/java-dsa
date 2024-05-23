import java.util.Scanner;

// swapping two no
//public class Swapping{
//    public static void main(String[] args) {
//        int temp ;
//        int a=98;
//        int b=65;
//        temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//    }
//}
// swapping two no without using extra variable
//public class Swapping{
//    public static void main(String[] args) {
//
//        int a=98;
//        int b=65;
//        a = a + b;
//        b = a - b;
//        a = a -b;
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//    }
//}
// swapping an array >
// write a program to reverse the array without using an extra array
public class Swapping{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter teh element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
         for(int i=0,j=n-1;j>i;i++,j--){
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
        }
         // for output
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
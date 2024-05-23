// rotate teh given array 'a' by k steps whwre k is non negative
//k can be greator than n where n is the size of array// hint : k>n  k = k % n
// if a = {1,2,3,4,5} or k= 1 so a is a = {5,1,2,3,4}
//  if a = {1,2,3,4,5} or k= 2 so a is a = {4,5,1,2,3}
import java.util.Scanner;

public class RotateByKSteps {
     static int [] reverse(int arr[],int a,int b) {// int [] jab hma array ko return karna ho
         for (int i = a, j = b; j > i; i++, j--) {
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
             //return arr;
         }
         return arr;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh size of array");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array");
        int k= 3;
        k= k%n;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        // for output
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
//   arr[7] = {1,2,3,4,5,6,7} if k=3 so ans is 5,6,7,1,2,3,4
//   sabse phele  reverse all the index no from 0 to 6 matlab 0 to n-1 -> 7,6,5,4,3,2,1
//    reverse from 0 to 3 index matlab 0 to k-1 -> 5,6,7,4,3,2,1
//  reverse from 3 to 6 index matlab k to n-1 -> 5,6,7,1,2,3,4
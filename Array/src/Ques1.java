// find the last occurrence in the array

//import java.util.Scanner;
//
//public class Ques1 {
//
//    static  int lastoccurrence(int arr[],int x){
//        int lastIndex = -1;
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]==x){
//                lastIndex = i;
//            }
//        }
//        return lastIndex;
//
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("entr the size of array");
//        int n = sc.nextInt();
//
//        int arr[] = new int[n];
//
//        System.out.println("enter teh element of array");
//        for(int i=0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//
//        }
//        System.out.println("enter x");
//        int x = sc.nextInt();
//
//        System.out.println("last index of x " +lastoccurrence(arr ,x));
//
//
//    }
//}

// check if the given array is sorted or not?
// sorted mean har array aapna phele vale element sa bada ya equal  hota ha

import java.util.Scanner;

public class Ques1 {

    static  boolean isSorted(int arr[]){
        boolean check = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
                break;
            }
        }
        return check;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter teh element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();

        }

        System.out.println("Is Sorted" +isSorted(arr));

    }
}

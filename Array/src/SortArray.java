// sort an array consisting of only 0 and 1?
// 100101100 5 zero ha 4 -> 1 ha , ams -> 000001111 4 index tak 0 aa rahi ha
//to 0 sa zero-1 index tak 0 put karna ha
// to hma count karni ha no of 0

import java.util.Scanner;

public class SortArray {
    static void printArray(int arr[]){// kese bhi array ko print karana ka liye
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortZeroAndOne(int arr[]){
        int countZero = 0;
              for(int i=0;i< arr.length;i++){
                  if(arr[i]==0){
                      countZero++;
                  }
              }

              for(int i=0;i<arr.length;i++){
                  if(i<countZero){
                      arr[i]=0;
                  }else{
                      arr[i]=1;
                  }
              }
    }

    static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
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
        //System.out.println("Original Array");
        //printArray(arr);
        sortZeroAndOne(arr);
        System.out.println("sorted array");

        printArray(arr);
    }
}

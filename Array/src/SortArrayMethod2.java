// sort an array consisting of only 0 and one ?

import java.util.Scanner;

public class SortArrayMethod2 {
    static void sortArray(int arr[]){
        for(int i=0, j= arr.length-1;j>i;i++,j--){
            if(arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }
    }
    static void printArray(int arr[]){// kese bhi array ko print karana ka liye
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter teh element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        sortArray(arr);

        System.out.println("sorted array");

        printArray(arr);
    }
}

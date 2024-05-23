// given an integer array sorted in a non decreasing order return an array of teh square
// of each no
//sorted in non decreasing order?
// absolute value of -10 is 10 arr = -10,-3,-2,1,4,5 sorted array
// esma sabse bada no ya to shuru ma hoga ya last because of - sign also
// ham do pointer lege left or right or dono ki absolute value compare karege or jiski value badi
// hogi uska square ko ham aapne ans ma add kar dege

import java.util.Scanner;
public class Ques4 {

    static void reverse(int arr[]){
            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[j] + " ");
            }
    }
    static void printArray(int arr[]){// kese bhi array ko print karana ka liye
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//    static int[] sortSquare(int arr[]){
//
//        int i = 0 ,j= arr.length-1;
//        int n = arr.length;
//        int[] ans = new int[n];
//        int k = 0;
//        while(j>=i){
//            if(Math.abs(arr[i])>Math.abs(arr[j])){
//                 ans[k++] = arr[i] * arr[i];
//                i++;
//            }
//            else{
//                 ans[k++] = arr[j] * arr[j];
//                j--;
//            }
//        }
//        return ans;
//     }

     static int [] sortSquare(int arr[]){
        int[] ans = new int[arr.length];
        int k = 0;
        for(int i=0, j=arr.length-1;j>=i;i++,j--){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k++] = arr[i] * arr[i];

            }
            else{
                ans[k++] = arr[j] * arr[j];

            }
        }
        return ans;
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
        int ans[] = sortSquare(arr);
        System.out.println("sort array");
        //printArray(ans);

        printArray(ans);

    }

}

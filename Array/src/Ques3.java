// given an array of integer a move all the evn integer at the beginning of the array followed by the odd integer
//the relative order of odd even integer does not matter return any array that satisfy the condition
// a = {1,2,3,4,5}  -> 2,4,3,5,1 don't mine ki konsa even or konsa odd phele aa raha


import java.util.Scanner;

public class Ques3 {

    static void oddEven(int arr[]){
            for(int i=0, j=arr.length-1;i<j;i++,j--){
                if(arr[i]%2!=0 && arr[j]%2==0){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j] = temp;
                }
                if(arr[i]%2==0){
                    i++;
                }
                if(arr[j]%2!=0){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter teh element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        oddEven(arr);

        System.out.println("ans");

        printArray(arr);

    }
}

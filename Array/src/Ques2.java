
import java.util.Arrays;
import java.util.Scanner;

public class Ques2 {

    static  int[] SmallestAndLargestElement(int arr[]){// int[] kyuki hma ek array return karana ha
        Arrays.sort(arr);// ya kisi bhi array ko sort kar dega
        // 1 2 3 4 55
        int[] ans = {arr[0],arr[arr.length-1]};
        return ans;
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

       int[] ans =  SmallestAndLargestElement(arr);
        System.out.println("Smallest"+ans[0]);
        System.out.println("largest"+ans[1]);

    }
}

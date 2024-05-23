import java.util.Scanner;

// given an integer a return the prefix sum/running sum in the same array without creating a new array
// a = 2,1,3,4,5  prefix = 2,3,6,10,15
// prefix[0]= a[0]  prefix[1]= a[0] + a[1]; prefix[2]= a[0]+a[1]+a[2]  prefix[3]= a[0]+a[1]+a[2]+a[3];
// prefix[0]= a[0]  prefix[1]= prefix[0] + a[1]; prefix[2]= prefix[1]+a[2]  prefix[3]= prefix[2]+a[3];
// prefix[i] = prefix[i-1]+a[i]
public class ArrayPrefixSum {

// ans without making new array?
    static int[] makePrefix(int arr[]){
        int n = arr.length;

        for(int i=1;i < n;i++){

            arr[i] = arr[i-1] + arr[i];// prefix sum without creating an new array
        }
        return arr;
    }
////    static int[] makePrefix(int arr[]){
//        int n = arr.length;
//        int pref[] = new int[n];
//        pref[0] = arr[0];
//        for(int i=1;i < n;i++){
//            pref[i] = pref[i-1] + arr[i];
//        }
//        return pref;
//    }

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
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int ans[]= makePrefix(arr);
        printArray(ans);
    }
}

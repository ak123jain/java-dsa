import java.util.Scanner;

//check if we can partition an array into two sub array with equal sum more formally check that the
// prefix sum of the part of the array is equal to the suffix sum of rest of the array
//       A   = 5,3,2,6,3,1
// prefix sum = 5,8,10,16,19,20
// suffix sum = 20,15,12,10,4,1
// for suffix sum => prefix[i] == suffix[i+1]
// suffix sum = total sum - prefix sum ( kisi point par)
public class Ques5 {


    static int TotalSum(int arr[]){
        int totalsum = 0;
        for(int i=0;i<arr.length;i++){
            totalsum+=arr[i];
        }
        return totalsum;
    }

    static boolean equalsumpartition(int arr[]){
        int totalsum = TotalSum(arr);
        int prefsum = 0;
        for(int i=0;i < arr.length;i++) {
            prefsum += arr[i];
// prefix sum with creating an  new array
            int suffixsum = totalsum - prefsum;
            if (suffixsum == prefsum) {
                return true;
            }
        }
         return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        System.out.println("enter teh element of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        // int ans = TotalSum(arr);

        System.out.println("equal partition possible " + equalsumpartition(arr));

    }
}

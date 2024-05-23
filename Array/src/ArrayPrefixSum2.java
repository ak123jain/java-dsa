
// given an array of integer of size n ans q queries where you need to print the sum of values in
// the given range of  indices from 1 to r(both included)
//the values of l and r in queries follow I based indexing?
//a = 2,4,1,3,6,5  -> l = 3 r = 5 l and r are index no
//    1 2 3 4 5 6    we make prefix sum from 3 to 5
// so we make prefix sum from up to 5 th index or prefix sum from  up to 2 th index subtract kar dege
// prefsum = prefix[r] - prefix[l-1]
import java.util.Scanner;

public class ArrayPrefixSum2 {

    static int[] PrefixSum(int arr[]){
     int pref[] = new int[arr.length];
     pref[0] = arr[0];
     for(int i=1;i< arr.length;i++){
         pref[i] = pref[i-1] +arr[i];
     }
     return pref;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n+1];

        System.out.println("enter teh element of array");
        for(int i=1;i<=n;i++){
            arr[i]= sc.nextInt();
        }

        int[] prefsum = PrefixSum(arr);// hmna pura array ka prefix of sum nikal diya or usa prefsum
        // ma store kar diya


        System.out.println("enter queries");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();
            // ab ham es ans method sa kisi bhi index ka bick ka sum nikal sakte ha

            int ans = prefsum[r] - prefsum[l-1];

            System.out.println("sum" +ans);

            q--;
        }
    }
}












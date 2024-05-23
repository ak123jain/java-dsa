//given an array of integer print sum of all subset in it output sum can be printed in any order
// 245 = 24,25,45,4,5,2,245
//sum =  6,6,9,4,5,2,11

public class Subsequence3 {
    static void subsetSum(int arr[],int n,int idx ,int sum){
        if(idx >= n){
            System.out.println(sum);
            return ;
        }

        // sum = curridx + sum


        //current element ko add karege
        subsetSum(arr,n,idx+1,sum+arr[idx]);// ham isme index le rahe ha kyuki ham isme string ki trah
        //0 th index vala element cut nahi kar sakte ya array ha
        //current element ko add karege
        subsetSum(arr,n,idx+1,sum);

    }
    public static void main(String[] args) {
        int arr[] = {2,4,5};
        subsetSum(arr, arr.length, 0,0);
        // plz see a dry run in lecture 35
        // ham isma index le rahe ha

    }
}

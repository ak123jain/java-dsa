public class RecursiveBinarySearch {

    static boolean recBinary(int arr[], int st , int end , int target){
    //    base case -> jaha hma khatam karna hota ha
        if( st > end) return false;// eska matlab target element arr ma present nahi haa
        int mid = (st + end)/2;
        if(target == arr[mid]){
            return true;
        }
        else if(target < arr[mid]){
            return recBinary(arr,st,mid-1,target);
        }
        else{
            return recBinary(arr,mid+1,end,target);
        }
    }
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
        int target = 0;
        while( target != 10){
            System.out.printf(" %d is present in the arr : %b  \n" , target,recBinary(arr,0, arr.length-1, target));
            target++;
        }
    }
}




//Find the Smallest Divisor Given a Threshold | Binary Search
//
//hma ek aesa aaray lena ha jisko agar ham pure aaray sa divide kare to uska sum
//          <= threshold sa kam ho
//
//arr   =    1      2      5    9       Threshold frequency = 6
//                                         divisor = 5
//          1/5   2/5      5/5   9/5
//         1   +  1     +  1    + 2 =   5  < = Threshold frequency
//        divisor = 5  is possible ans
//
//        arr   =    1      2      5    9       Threshold frequency = 6
//                                               divisor = 4
//
//                   1  +    1   + 2  +  3  =   7           sum jyada ho not a possible ans
//
//  so 5 is our answer
//
//    if arr.size> threshold     reteurn -1


// divisor is a part of array divisor is a middle element usko pure array sa divide karege phir jo ans aayega uska sum agarb <= threshold ha to possible ans
// phir uska baad or min check karege array mato end = mid - 1 or agar nahi mila to st = mid + 1




public class Threshold {
    static int sumbyD(int arr[], int divisor) {
        int n = arr.length;
        // finding sum
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Math.ceil( (double) (arr[i]) / (double)  (divisor));
        }
        return sum;
    }
    static int smallestDivisor(int arr[],int threshold){
        int n = arr.length;
        if (n > threshold) return -1;
        int st = 1 , end = (int)1e9;
        int ans = 1;
        while(end >= st){
            int mid = st + (end-st)/2;
            if(sumbyD(arr,mid)<=threshold){// may be possible ans
                ans = mid;
                end = mid -1;
            }
            else{
                st = mid + 1;// aaga check karege
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,11};
        int threshold = 11;
        int ans = smallestDivisor(arr, threshold);
        System.out.println(ans);
    }
}

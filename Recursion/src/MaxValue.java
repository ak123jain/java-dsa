public class MaxValue {
    static int maxvalue(int arr[] ,int idx){
        if(idx== arr.length-1){// condition of last element
            return arr[idx];// hma sabse last vala element return karna ha
        }
         int SmallAns =  maxvalue(arr,idx+1); // last element ki value yaha return hogi
        return Math.max(SmallAns,arr[idx]);// or phir ham usko arr ka har element sa compare karege
    }
    public static void main(String[] args){
        int arr[] = {5,6,7,8,9};

        System.out.println(maxvalue(arr,0));
    }
}

// print the sum of the array ?
public class SumOfArray {
    static int maxvalue(int arr[] ,int idx){
        if(idx== arr.length-1){// condition of last element
            return arr[idx];// hma sabse last vala element return karna ha
        }
        int SmallAns =  maxvalue(arr,idx+1); // last element ki value yaha return hogi ekk karke phele 9,8,7,6,5
        return SmallAns +arr[idx];
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};

        System.out.println(maxvalue(arr,0));
    }
}// please do a dry run in copy
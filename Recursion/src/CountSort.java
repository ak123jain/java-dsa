/// in this code we do not maintain stability ?

//arr[] = 2 ,3 , 0, 1 ,4 ,5    5 ki value read karni ha count ka 5th ind ma
//count = 2 , 4,  7 , 8, ,10   element array ka ha or idx count ka ha to  count[arr[i]]
//idx   = 0 , 1,  2 , 3 ,  4


public class CountSort {

    static void displayarr(int[] a){
        for(int val : a){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static int findmax(int arr[]){
        int max =  Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if( arr[i]>max)
            max = arr[i];
        }
        return max;
    }
    static void basiccountsort(int arr[]){
            int n= arr.length;
            int max = findmax(arr);// pura array ma jo max element hoga ussa ek jadda ham frequency arrray ka index lege
            // eg = 1,4,5,2,2,5 max = 5  frq array[max+1]
            int[] count = new int[max+1];
            for(int i=0;i< arr.length;i++){//ab ham array ma travel kar rahe ha or array ma man lete ha ha 0 index par 5 element ha
                //to count array ma 5 index par 1 add hogyega  or arrat ma phir sa 5 aata ha to us hi index ka element ma 2 ho gyega
                count[arr[i]]++;
            }
            // count arr = 5 ,4, 3, 2, 3 frequency array
        //     index     = 0  1  2  3  4    matlab 0 5 barr ayega , 1 4 barr ayega
        int k = 0;
        for(int i=0;i< arr.length;i++){// phele index par 4 element ha unko aalag karn aka liye
            for(int j=0;j<count[i];j++){
                arr[k++] = i;// hma har baar index no print karna ha esliye i
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,2,5};
        basiccountsort(arr);
        displayarr(arr);
        basiccountsort(arr);
        displayarr(arr);
    }
}

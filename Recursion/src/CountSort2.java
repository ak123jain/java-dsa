/// in this code we do not maintain stability ?
// count matlab frequency array matlab jo element repeat ho rahe hote ha unko ek hi index ma rakhta ha
//arr[] = 2 ,3 , 0, 1 ,4 ,5    5 ki value read karni ha pref sum ka 5th ind ma
//count = 2 , 4,  7 , 8, ,10   element array ka ha or idx count ka ha to  count[arr[i]]
//idx   = 0 , 1,  2 , 3 , 4
//pref sum = 0 ,2 , 2, 5 , 6 , 8   ab jo array ka last element ha usko pref ka idx ma dhoondh
//idx   = 0 , 1,  2 , 3 , 4  , 5  matlab idx search karna ha pref sum ka
//                        idx =  count[arr[i]] - 1
//              idx ha pref sum ka or element ha orignal array ka
//     or us idx ka ek element ek kam kar da or phir output ma 7th position matlab 6th idx par
//  array ka last element rakh dege
// eg = 5  aray ka last emt usko pref ma 5th idx par dekhege kya ha 8th ha to ek decrese bhi kardo or output
// ka 7th index par 5 rakh dege
// this code is written again to maintain stability of count sort ?
public class CountSort2 {
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
////    static void basiccountsort(int arr[]){
//        int n= arr.length;
//        int max = findmax(arr);// pura array ma jo max element hoga ussa ek jadda ham frequency arrray ka index lege
//        // eg = 1,4,5,2,2,5 max = 5  frq array[max+1]
//        int[] count = new int[max+1];
//        for(int i=0;i< arr.length;i++){//ab ham array ma travel kar rahe ha or array ma man lete ha ha 0 index par 5 element ha
//            //to count array ma 5 index par 1 add hogyega  or arrat ma phir sa 5 aata ha to us hi index ka element ma 2 ho gyega
//            count[arr[i]]++;
//        }
//        // count arr = 5 ,4, 3, 2, 3 frequency array
//        //     index     = 0  1  2  3  4    matlab 0 5 barr ayega , 1 4 barr ayega
//        int k = 0;
//        for(int i=0;i< arr.length;i++){// phele index par 4 element ha unko aalag karn aka liye
//            for(int j=0;j<count[i];j++){
//                arr[k++] = i;// hma har baar index no print karna ha esliye i
//            }
//        }
//    }

    static void countsort(int arr[]){
        int n= arr.length;
        int output[] = new int[n];
        // making frequency array
        int max = findmax(arr);// pura array ma jo max element hoga ussa ek jadda ham frequency arrray ka index lege
        // eg = 1,4,5,2,2,5 max = 5  frq array[max+1]
        int[] count = new int[max+1];
        for(int i=0;i< count.length;i++){// frequency array
            //ab ham array ma travel kar rahe ha or array ma man lete ha ha 0 index par 5 element ha
            //to count array ma 5 index par 1 add hogyega  or arrat ma phir sa 5 aata ha to us hi index ka element ma 2 ho gyega
            count[arr[i]]++;
        }
        // make prefix sum array of count array or frequency array
        // jo hmara count array tha usi ka hman apref sum kar diya or us function ka name count hi ha
        // making pref sum
        for(int i=1;i< arr.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){// orignal array ka loop chalaya ellement ko ham pref sum ka idx ma search karege
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];//  jo bhi element milega ussma sa agar 1 element - kar de to us index man kar output array ko fill karege
            count[arr[i]]--;
        }
        // copy all element of output in array
        for(int i=0;i<n;i++){
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,2,2,5};
        displayarr(arr);
        countsort(arr);
        displayarr(arr);
    }
}

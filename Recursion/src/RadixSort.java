// sorting through ones, tens ,thousand , hundred
//           ones tens  thousand
//         sorting   sorting
//     170   170  802  002
//     045   090  002  045
//     075   802  045  075
//     090   002  170  090
//     802   045  075  170
//     002   075  090  802


//                            ones place
// arr = 170 , 045 , 075 , 090 , 802 , 002
//count = 2 0 2 0 0 2 0 0 0 0
//idx =   0 1 2 3 4 5 6 7 8 9  ones place par 0 do baar aaraha ha as same as
//  count pref = 2 2 4 4 4 6 6 6 6 6
//  idx   =      0 1 2 3 4 5 6 7 8 9
// output =   170 , 090 , 802 , 002 , 045 , 075
// idx =       0     1     2     3    4      5
// eg array ka last element ma ones place par 2 to ham count pref ka 2 ind par jyege or uska element ki
// ek value - kar dege 4 sa 3 ab ham output array ma 3rd index par 002 put kar dege
// and repeated task for tens  hundred thousand

// in this code we also find ki us element ka ones place par konsa element ha
// x = 72456 ->  place = 100
// digit place = (x/place) % 100
//   72456/100 = 724 % 10 = 4
public class RadixSort {
    static void displayarr(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int findmax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void countSort(int arr[], int place) {
        int n = arr.length;
        int output[] = new int[n];
        // making frequency array
        int max = findmax(arr);// pura array ma jo max element hoga ussa ek jadda ham frequency arrray ka index lege
        // eg = 1,4,5,2,2,5 max = 5  frq array[max+1]
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {// frequency array
            //ab ham array ma travel kar rahe ha or array ma man lete ha ha 0 index par 5 element ha
            //to count array ma 5 index par 1 add hogyega  or arrat ma phir sa 5 aata ha to us hi index ka element ma 2 ho gyega
            count[(arr[i] / place) % 10]++;
        }
        // make prefix sum array of count array or frequency array
        // jo hmara count array tha usi ka hman apref sum kar diya or us function ka name count hi ha
        // making pref sum
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {// orignal array ka loop chalaya ellement ko ham pref sum ka idx ma search karege
            int idx = count[(arr[i] / place) % 10] - 1;
            output[idx] = arr[i];//  jo bhi element milega ussma sa agar 1 element - kar de to us index man kar output array ko fill karege
            count[(arr[i] / place) % 10]--;
        }
        // copy all element of output in array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int arr[]) {
        int max = findmax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSort(arr, place);
        }
    }

    public static void main(String[] args) {
        int arr[] = {43, 453, 626, 894, 0, 3};
        displayarr(arr);
        radixSort(arr);
        displayarr(arr);
    }

}
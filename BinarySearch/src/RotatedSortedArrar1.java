//a rotated sorted array is a sorted on which the rotated operation has been performed some no of time
//given a rotated sorted arry     find the index of the min element in the array
//follow 0 based indexing
// it is guaranted thet all teh element in the array are unique
//input  = 3,4,5,1,2
// first we found min index element we saw in a rotated sorted array half of the array is sorted
// 3 , 4 , 5 , 1 , 2
// sorted  from 3 to 5 sorted from 1 to 2
//  5 6 7 8 9 10      1 2 3 4
//  0 1 2 3 4  5      6 7 8 9
//  s          m            e
//   1st sorted       2nd sorted
// jaha ek sorted array kahatam ho raha ha usko pivot bol dete ha 1 is pivot
// pivot is the min elemnt in only that type of question
// all the element the second sorted array are lesser than or equal to last element <= arr[n-1]
// 1 sorted array ma > arr[n-1]
//   if(a[mid]>a[n-1])  to ham 2nd sorted array par shift hogyege
//  st = mid + 1
//  5 6 7 8 9 10      1 2 3 4
//  0 1 2 3 4  5      6 7 8 9
//             s        m   e
//   if(a[mid]<=a[n-1])      ans = mid   end = mid - 1  the value of mid in nas is updating not fixed in one time bcoj we need min element index
// ans ka andar mid esliye kyuki vo bhi possible ans ho sakta tha agar vo pivot hota to
//  5 6 7 8 9 10      1 2 3 4
//  0 1 2 3 4  5      6 7 8 9
//             s      e
//             m
//
public class RotatedSortedArrar1 {

    static int findMinimum(int a[]){
        int n = a.length;
        int st = 0 , end = a.length-1;
        int ans = -1;
        while(end>=st){
            int mid = st + (end-st)/2;
                if(a[mid]<=a[n-1]){
                    ans = mid;
                    end = mid - 1;
                }
                else{
                    st = mid +1;
                }
        }
        return ans;
    }
    public static void main(String[] args) {
     int[] a = {3,4,5,1,2};
        System.out.println(findMinimum(a));

    }
}

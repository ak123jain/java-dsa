//given a mountain array 'a' of length greator than 3 . return the index 'i' such that
//arr[0] < arr[1] < ... < arr[i-1] < arr[i] > arr[i+1] > ... > arr[arr.length-1]
//the index is know as peak idx

// array = [0,4,1,0]
//output =1
//                       i+1
//                        5
//            i+1       4    3    i
//                     3      2
//                   2          1
//          i       1             0       i+1

//       arr[i] < arr[i+1]              arr[i+1] < arr[i]

// last idx for which  for which  arr[i] < arr[i+1]
//    mid = 2         mid + 1 = 4   return ans = mid + 1


//     mid + 1 > mid  incresing mountain  left  mountain
//     mid > mid + 1  decreasing mountain right  mountain

//eg ->   2     4    10     7     3      1       0
//        0     1     2     3     4      5       6
//        st                m                    e
//
//                               if mid >  mid + 1  to matlab decreasing mountain
//                               to end = mid - 1

//eg ->   2     4    10     7     3      1       0
//        0     1     2     3     4      5       6
//        st    m     e

//               if mid < mid + 1 to matlab increasing mountain
//                  to eska matlab mid + 1 bhi ans ho sakta ha ans = mid + 1   = 2
//              lekin ham aaga bhi check karege  to st = mid + 1

//eg ->   2     4    10     7     3      1       0
//        0     1     2     3     4      5       6
//                    e
//                    m
//                    st

//                mid > mid + 1   to  end = mid - 1

//eg ->   2     4    10     7     3      1       0
//        0     1     2     3     4      5       6
//              e     m
 //                   st

//   aya condition  braek kar rah aha   to ans == 2 hi ha

public class LeetCode2 {
    static int PeakIndex( int Mountain[]){
        int st = 0 , end = Mountain.length-1;
        int ans =-1;
        while(end>=st){
             int mid = st + (end-st)/2;
           if(Mountain[mid]< Mountain[mid+1]){
               ans = mid + 1;
               st = mid + 1;
           }
           else{
               end = mid - 1;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
    int Mountain[] = {0,1,0};
        System.out.println(PeakIndex(Mountain));
    }
}

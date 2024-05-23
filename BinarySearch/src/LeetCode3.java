
// find the peak eleemnt and return its idx

//        1      2     1     3      5        6        4
//       case -> 1
//             a[mid-1]<a[mid]>a[mid+1]   peak element is always greator
//
//           if(a[mid]>a[mid-1]  && a[mid]>a[mid+1]) return mid
//
//    case -> 2  mid  is on uphills
//
//    1  a[mid]  <  a[mid+1]   esma mid+1 ka baad ek peak element hoga to st = mid + 1 kar dege
//    2  a[mid]  <  a[mid+1]   esma mid+1 khud hmara peak element ha to st = mid + 1 kar dege
//    3   a[mid]  <  a[mid+1]  esma mid+1 ka baad ek peak element hoga or uska baad decrease to bhi st = mid + 1 kar dege


//      case -> 3   mid is down hills
//
//     1  peak element < a[mid]  <  a[mid+1]  to end = mid - 1
//     2  peak element < a[mid]  <  a[mid+1]  peak sa phele decrese kar gaya
//     3  a[mid]  <  a[mid+1]    mid khud peak element ha


//    1   2   1    3     5    6     4
//    0   1   2    3     4    5     6
//    s            m                e
//
//     mid < mid + 1   eska matlab peak element aaga ha to aag search karege  st = mid + 1
//
//    1   2   1    3     5    6     4
//    0   1   2    3     4    5     6
//                       s    m     e

//            a[mid]>a[mid-1]        a[mid]>a[mid+1]  return mid  -> 5 ans 
public class LeetCode3 {
    static int PeakElement(int a[]){
        int n = a.length;
        int st = 0 , end = n-1;
        while(end>=st){
            int mid = st + (end-st)/2;
            if((mid == 0 || a[mid]>a[mid-1]) &&  ( mid == n-1 || a[mid]>a[mid+1])){
                return mid;
            }
            if(a[mid] < a[mid+1]){          // ascending order
                st = mid + 1;
            }
            else{                          //  descending order
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
   int a[] = {1,2,3,1,9};
        System.out.println(PeakElement(a));
    }
}


//                      BINARY SEARCH ALGORITHM
//                 find x target in the sorted array using binar search algorithm

//          target = 24

// a = 2  ,  4 ,  5 ,  7 ,  15 ,  20 ,  24 ,  45 ,  50 ,  77
//     st                   mid                           end

//   a[mid] == target                target < a[mid]              target > a[mid]
//

//  hman dekha  target > a[mid] ya seen ha to mid or mid sa phele vali sare value ma ab hma target search nahi karna
//
// a = 2  ,  4 ,  5 ,  7 ,  15 ,  20 ,  24 ,  45 ,  50 ,  77
//                                st          mid         end

// hman dekha  target < a[mid]  to mid or mid ka baad vale element bekar
// a = 2  ,  4 ,  5 ,  7 ,  15 ,  20 ,  24 ,  45 ,  50 ,  77
//                                st    end
//                                mid

//    target > a[mid]  to mid or mid sa phele vale element bekar
//         a[mid] == target   so 24 is my target ans

// mid = (starting idx + end idx)/2

  //                    target < a[mid]              target > a[mid]
  //                     end = mid - 1                 st = mid+1

// ya process jab tak  while(start<=end)
public class Main {
    public static void main(String[] args) {

    }
}
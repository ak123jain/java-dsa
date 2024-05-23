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


//public class BinarySearch {
//
//    static boolean binarySearch(int arr[], int target){
//        int n = arr.length;
//        int st = 0 , end =  n-1;
//        while(end>=st){
//            int mid = (st + end )/2;
//            if(target == arr[mid]){
//                return true;
//            }
//            else if(target < arr[mid]){
//                end = mid - 1;
//            }
//            else{
//                st = mid + 1;
//            }
//        }
//        return false;// agar target present he nahi hua array ma to false return kar dega
//    }
//    public static void main(String[] args) {
//        int arr[] =  {1,2,3,4,5};
//        int target = 4;
//        System.out.println(binarySearch(arr,target));
//
//    }
//}


//we chaeck multiple target through the code

public class BinarySearch {
    static boolean binarySearch(int arr[], int target){
        int n = arr.length;
        int st = 0 , end =  n-1;
        while(end>=st){// ya code jab tak chalega jab tak start end ka equal na ho gaye
            int mid = (st + end )/2;
            if(target == arr[mid]){
                return true;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return false;// agar target present he nahi hua array ma to false return kar dega
    }
    public static void main(String[] args) {
        int arr[] =  {1,2,3,4,5};
        int target = 0;
        while( target != 10){
            System.out.printf(" %d is present in the arr : %b  \n" , target,binarySearch(arr,target));
            target++;
        }

    }//   %d is target  and %b is represent true or false or boolean esliye boolean
}
// better way to find mid value
 // mid = st + (end - st)/2;
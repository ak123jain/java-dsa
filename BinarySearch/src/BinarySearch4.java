// //find the last occurence of the given element x  , given that the given array is sorted if
////no occurrence of x is found then return -1
////  arr = 2 , 5, 5 , 5, 6, 6, 8, 9, 9, 9
//// x = 5  phele jaha bhi ya x element found hota ha uska index print kardo
////output = 1;
//
////    bas phele code ma ek change karna ha
//// jab hma hmara target element x mil gaye to ya sure nahi ha ki vo phela element ha ki nahi esliye
////        end = mid - 1    or phele check karna ka liye target element
////  esliye fo ham -1 sa intialize kar dete ha phir baad ma update kar dete ha or phir sabse last ma
////  target element mile to index update kar de through mid value
////  first occurrence = -1
////      if( x == arr[mid])   fo = mid    end = mid - 1
////

public class BinarySearch4 {
    static int FirstOccurrence(int arr[], int x){
        int n = arr.length;
        int st = 0 , end =  arr.length-1;
        int ans = -1;

        while(st<=end){
            int mid = st + (end-st)/2;
            if(arr[mid]==x){
                st = mid +1;//It mean all the element are lesser. So, we have to search at the right side
                ans = mid;
            }
            else if(x<arr[mid]){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
         return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5,0,5,5,2,5,4};
        //           s     m      e
        //                   s m  e
        //                   s m e
        //                     yaha par hmna middle index print kar diya
        int x = 5;
        System.out.println(FirstOccurrence(arr,x));
    }
}

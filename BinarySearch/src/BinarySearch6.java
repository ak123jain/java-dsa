//given a rotated array contain a distict element and an integer target return the index of target
// if it is in the array other wise return -1
// arr = 3 4 5 1 2 target = 4
// ans = 1


//    property of rotated sorted array
//
//    x             mid            y
//
//1    x to mid sorted  and mid to y is sorted
//2    one of them will be sorted and other will be not
//
//    3 if(arr[x]<arr[y])  so array is sorted  condition if pivot is not include in between
//       one of else x and y will be pivot

// 3  4  5  1  2  we can apply individually binary search so we have to find the starting index of second sorted array called pivot

//eg = 9 , 10 ,11 , 12 ,   1 , 2 , 3 , 4, 5 , 6, 8    target = 12
//     0    1   2    3     4   5   6   7  8   9  10
//     s                       m                  e

//    if(a[mid]<a[end]) {  mid to end is sorted by property 1   then check the target is lies in between or not
//   if(target > a[mid]) && target <= end )  to st = mid +1
// else end = mid - 1 }

//  else (a[mid]>a[end])// st to mid is sorted -> in an array one of them will be sorted and other will be not
// if(target >= a[st]  && target < a[mid]) to end = mid - 1
// else st = mid + 1

//eg = 9 , 10 ,11 , 12 ,   1 , 2 , 3 , 4, 5 , 6, 8    target = 12
//     0    1   2    3     4   5   6   7  8   9  10
//     s                       m                  e

// target is not lie in between   to end = mid - 1

//eg = 9 , 10 ,11 , 12 ,   1 , 2 , 3 , 4, 5 , 6, 8    target = 12
//     0    1   2    3     4   5   6   7  8   9  10
//     s        m          e

// mid is not less than end

//  else // st to mid is sorted -> in an array one of them will be sorted and other will be not
// if(target >= a[st]  && target < a[mid]) to end = mid - 1
// else st = mid + 1

//eg = 9 , 10 ,11 , 12 ,   1 , 2 , 3 , 4, 5 , 6, 8    target = 12
//     0    1   2    3     4   5   6   7  8   9  10
//                   s     e

public class BinarySearch6 {

    static int search(int a[], int target){
        int st = 0 , end = a.length-1;

        while(end>=st){
            int mid = st + (end-st)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<a[end]){
                if(target > a[mid] && target <= a[end]){
             st = mid + 1;
                } else{
                end = mid - 1;
              }
            }// agar aupar vala else if nahi hua to
            else{
                if(target >= a[st]  && target < a[mid]){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {3,4,5,1,2};
        int target = 4;
        System.out.println(search(a,target));
    }
}

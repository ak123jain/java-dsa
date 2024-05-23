// integer in each row are sorted
// integer in each row are sorted in ascending oerder from top  to bottom
//               2  4   6    8   target = 14
//               5  6   7   20
//               7  11  13   25      i = 0 , j = m - 1
//              12  14  17   30

//
//  in this case first integer of each row is not greator than the last integer of previous row

//     we can compare the value of target from 8
// if target < 8  j--  if target > 8  i++   to i++
//   target < 20    to j--
//  target > 7    i++
//  target > 13  i++
//  target < 17  j--
// target == 14

//
public class LeetCode {
     static boolean searchTarget(int arr[][], int  target){
         int n = arr.length , m = arr[0].length;

         int i = 0 , j = m - 1;
//             i ki value n ta increase karege or j ki value 0 tak decrease karege
         while(i < n && j >= 0) {// kyuki ham i ko increase kar rahe ha or j ko decresse
             if (arr[i][j] == target) return true;
             if (target < arr[i][j]) {
                 j--;
             } else {
                 i++;
             }
         }
         return false;
     }
    public static void main(String[] args) {
    int arr[][] = {{2,4,6,8},{5,6,7,20},{7,11,13,25},{12,14,17,30}};
    int target = 14;
        System.out.println(searchTarget(arr,target));
    }
}

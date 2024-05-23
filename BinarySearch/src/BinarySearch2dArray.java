//    search the target element in 2d matrix
//    integer in each row are sorted
//    the first integer of each row is greator than the last integer of previous row

//    all the matrix element are represent through index no 0 to 11
//           1   3   5   7     n = 3  , m = 4  to find the row no or column of element
//          10  11  16  20              i -> i/m -> row  , i % m -> column
//          23   30  34  60                 i -> element index

  // st = 0   end = n*m - 1      target = 16

//     st       mid      end
//     0         5        11
//           (5/4,5%4) -> (1,1)   row and column  target > a[mid] to mid ka baad search karna hoga st = mid + 1
//     6         8        11
//           (8/4,8%4) -> (2,0)     target < a[mid]  mid sa phele search karna hoga  end = mid - 1
//     6         6         7
//             (1,2) ->      target = a[mid]
// we figured mid directly from 2d matrix without using 1d matrix

public class BinarySearch2dArray {
    static boolean searchMatrix(int arr[][],int target){
        int n = arr.length , m = arr[0].length;
        int st = 0 , end = n * m -1;
        while(end>=st){
            int mid = st + (end-st)/2;// mid idx
            int midElmt = arr[mid/m][mid%m];// jis bhi element ka row column idx find karna ha
            // us eleemnt ka index column sa divide kar do
            // midelmt ka row or column idx

            if(midElmt == target ) return true;

            if(target < midElmt){
                end = mid - 1;
            }
            else{
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
    int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target = 60;
        System.out.println(searchMatrix(arr,target));
    }
}

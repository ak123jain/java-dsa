//given an array of positive and negative no ,segregate them in a linear time and constant space
//the output should print all the negative no along with all positive number
//input = 19 , -20 , 7 , -4 , -13 , 11 , -5 , 3
//output = -20 , -4 , -13 , -5 , 7 , 11 , 19 ,3

// can solve this question by quick sort ma partition method ek pivot element manege 0 it is not a real pivot it is imaginary pivot
// 0 sa phele sare choote element or 0 ka baad saree bade element
// and the sorting between negative no and positive no is nothing
//  input = 19 , -20 , 7 , -4 , -13 , 11 , -5 , 3
//           l                                  r
//       num[l]>0   num[r]<0  swap the number
//       num[l]<0 l++   num[r]>0  r--
public class LeetCode2 {
    static void display(int []arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static void partition(int arr[]){
        int l = 0 , r = arr.length-1;
        while(l < r){
            while(arr[l]<0) l++;
            while(arr[r]>=0) r--;  // 0 is positive
            if(l<r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }

    }
    public static void main(String[] args) {
      int arr[] =  {19 , -20 , 7 , -4 , -13 , 11 , -5 , 3};
      partition(arr);
      display(arr);
    }
}

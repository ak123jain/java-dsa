//given an array of size n containing only 0s and 1s and 2s sort the array in asending order
//input n = 6
//arr = 1  1  1  2  2  0  0  1  1  2  2  0  2
//     low                                 high
//     mid

//          [0,low-1] ->   0
//          [low,mid-1] -> 1
//          [mid,high] -> unknown   jab tak hmare unknown element ha jab tak array sort nahi hua
//          [high+1,n-1] -> 2
//

//          a[mid] = 0  swap kar dege swap(mid,low) low++ mid++
//          a[mid] = 1   mid++
//          a[mid] = 2   swap (mid,high)  high  hmare mid ka paas value high sa aa rahe ha to hma pata nahi vo konsi value ha esliye mid++ nahi kiya
                  
//           please make a dry run for this easy dry run
public class Question9 {
    static void display(int []arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static void swap(int arr[] , int x , int y){// x and y are the  indexes en index par jo element hoge unko swap karege
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int arr []){
        int low = 0 , mid = 0, high = arr.length-1;

        // explore the unknown region

        while(high>=mid){
            if(arr[mid]==0){
                swap(arr,mid,low);
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ={2 , 2 , 0, 0 , 1 ,1, 2 , 0 , 1 , 0};
        sort012(arr);
        display(arr);
    }
}

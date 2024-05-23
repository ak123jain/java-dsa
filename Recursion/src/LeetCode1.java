//given an array whwre all the eleemnt are sorted in increasing order except two swapped element
//sort it in linear time assume they are no duplicate element in the array
//aar = 3 , 5 , 6 , 7 , 8 , 9 , 10
//swap two eleemnt = 3 , 8 , 6 , 7 , 5 , 9 , 10  ab es array ko sort karna ha
//                 d       d       d -> distortion
//eg = 3 , 5 , 9 , 7 , 8 , 6 , 10  phele distortion ma x ki value 2 or y =3 par dusri distortion ma
//             x   y       y      x ki value vo he or y ki value update kar dege
//             2   3       5          or x or y ki value swap kar dege
//     arr[i-1]>arr[i]  x = i-1 or y ki y = i
// ya pata lagana ka liye ki ya  1st distortion ha ya second ham x = -1 rakh dege
//     if( x==-1 ) x = i-1 or y = i 1st distortion
//else    y = i   2st distortion  agar x = -1 nahi hoyi to x ki value vo hi or y ki update
// or phir swap
public class LeetCode1 {

    static void display(int []arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    static void sortArr(int arr[]){
        int n = arr.length;
        int x = -1 ,y = -1;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                if(x == -1){  //1st conflict
                    x = i-1;
                    y = i;
                }
                else{   // 2st conflict
                    y = i;
                }
            }
        }
        // swap two element
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
     int[] arr = {10 , 5 ,6 , 7,8 ,9 ,3};
     sortArr(arr);
     display(arr);
    }
}

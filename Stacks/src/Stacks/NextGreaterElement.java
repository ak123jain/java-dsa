package Stacks;

public class NextGreaterElement {
    public static void main(String[] args) {
    int arr[] = {1,  3 , 2,  1 , 8   ,6 , 3 , 4};
    int n = arr.length;
    int res[] = new int[arr.length];
    for(int i=0;i<n;i++){
        res[i] =  -1;// agar condition nahi chali to -1
        int ele = arr[i];
        for(int j=i+1;j<n;j++){
            if(arr[i]<arr[j]){
                res[i] = arr[j];
                break;
            }
         }
       }
     for(int i=0;i<n;i++){
         System.out.print(arr[i]+" ");
     }
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(res[i]+" ");
        }
    }
}

// NextGreaterElement
// input : 1  3  2  1  8   6  3  4
// res :   3  8  8  8  -1  -1 4  -1

// array se solve karna par = tc = 0(n^2) , sc = 0(1)
// using stack solve kaege taki tc = 0(n)
// 4 ka next greator koi nahi ha esliye -1
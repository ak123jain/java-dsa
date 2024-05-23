// give an array of n integer and a target value x print wheather if the x exist in the array or not ?

import java.util.ArrayList;
import java.util.Scanner;

//public class ExistanceInArray {
//    static boolean search(int []arr, int n,int target,int idx){
//     if(idx == n) return false;
//     if(arr[idx] == target) return true;
//     return search(arr, arr.length, target,idx + 1);
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,4};
//        int target = 2;
//        if(search(arr,arr.length,target,0)){
//            System.out.println("found");
//        }
//        else{
//            System.out.println("not found");
//        }
//
//    }
//}

 //give an array of n integer and a target value x print the index no if the x exist in the arra
//public class ExistanceInArray {
//    static int search(int []arr, int n,int target,int idx){// int jab lagete ha jab hma value return karni ho
//        if(idx == n) return -1;
//        if(arr[idx] == target) return idx;
//        return search(arr, arr.length, target,idx + 1);// hma value nicha return karani ha yahi print nahi karni esliye return kara
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,4};
//        int target = 2;
//
//        int ans = search(arr,arr.length,target,0);
//        System.out.println(ans);
//
//    }
//}


//return all the indexes present in the array?
//public class ExistanceInArray {
//    static void search(int []arr, int n,int target,int idx){// void jab value return na karni ho
//        if(idx == n) return ;
//        if(arr[idx] == target){
//            System.out.println(idx);
//        }
//        search(arr, arr.length, target,idx + 1);
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,4,4,4};
//        int target = 4;
//
//         search(arr,arr.length,target,0);
//
//
//    }
//}


// anoter method of return an index no 
//public class ExistanceInArray {
//    static void search(int []arr, int n,int target,int idx){// void jab value return na karni ho
//        if(idx == n) return ;
//        if(arr[idx] == target){
//            System.out.println(idx);
//        }
//        search(arr, arr.length, target,idx + 1);
//    }
//
//    public static void main(String[] args) {
//
//        int arr[] = {1,2,3,6,9,4};
//        int target = 4;
//
//        search(arr,arr.length,target,0);
//
//
//    }
//}

//return all indexes as array list if x exist in the array


public class ExistanceInArray {
    static ArrayList<Integer> search(int []arr, int n,int target,int idx){// agar return type array list ha to array list hi return karna padega
        if(idx == n) return new ArrayList<Integer>();// return empty arraylist
        ArrayList<Integer> ans = new ArrayList<>();// ek array list jisma ham arraylist return karege
        if(arr[idx] == target){
            ans.add(idx);
        }
         ArrayList<Integer> smallAns = search(arr, arr.length, target,idx + 1);// hma eska ans ek arraylist ma hi recieve karna hoga aupar sa kyuki aupar vo arraylist ma hi return karega
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args){

        int arr[] = {4,2,4,4};
        int target = 4;

           ArrayList<Integer> ans = search(arr,arr.length,target,0);// integer ki ek array list bana li jiska name ans ha

          for(Integer i : ans){
              System.out.println(i);
          }


    }
}


public class PrintArray {
    static void Printarray(int arr[] ,int idx) {
         if(idx == arr.length){
             return;
         }
        System.out.println(arr[idx]);
        Printarray(arr,idx+1);

    }
    public static void main(String[] args) {


        int arr[] = {5,6,7,8,9};

         Printarray(arr ,0);



    }
}


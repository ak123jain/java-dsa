
//public class MethodArrayInput {
//     method to print any array
//    static void printArray(int arr[]){
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        int arr[] = new int[5];
//         arr[0] = 2;
//         arr[1] = 6;
//         arr[2] = 7;
//         arr[3] = 9;
//         arr[4] = 5;
//
//        System.out.println("original array");
//         printArray(arr);
//
//         // trying to copy arr to arr_2;
//
//        int []arr_2 = arr;
//
//        System.out.println("copied array");
//        printArray(arr_2);
//
//        arr_2[0] = 0;
//        arr_2[1] = 0;
//
//        System.out.println("original array after changing arr_2");
//        printArray(arr);
//
//        System.out.println("copy array after changing value");
//        printArray(arr);
//
//    }
//}

//int arr[] = new arr[];
//int[] arr_2 = arr;

//stacks = arr 101 ,arr_2 101  dono ka andar same adress kyuki copy ha
//agar dono ka adress aalag karna ho to int arr_2 = arr.clone();
//heaps = [5,6,7,8,9]
//
//        arr_2 [0] = 0;
//        arr_2 [1] = 0;
//heaps = [


import java.util.Arrays;

public class MethodArrayInput {
    // method to har array ko 0 karna ka liya
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 2;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 5;

        System.out.println("original array");
        printArray(arr);

        // trying to copy arr to arr_2;

        int []arr_2 = arr.clone();// ya taki dono arr ka adress change ho sake
        // or arr_2 ki value change ho gaye
        //mtlab ab ki baar heap ma 2 aalag array banaga or dono ka adress aalag ha
        // stacks ma reference variable variable banta ha jo heap ma bana adress ko point kar rahe
        // es case ma heap ma do adress banaga ek arr1 or arr_2
        // or heap ma memory allocate hoti ha

        // ham clone ki jgah ya method bhi use kar sakte ha
        //int [] arr_2 = Arrays.copyOf(arr,arr.length);// esma hma do parameter dene hote ha



        System.out.println("new  array");
        printArray(arr_2);

        arr_2[0] = 0;
        arr_2[1] = 0;

        System.out.println("original array after changing arr_2");
        printArray(arr);

        System.out.println("new array after changing value of arr_2");
        printArray(arr_2);

    }
}


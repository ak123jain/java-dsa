
class Array{
//    void demoArray(){
//        int ages[] = new int[5];// size declare in array in java
//
//        ages[0]= 36;
//        ages[1]= 12;
//        ages[2]= 45;
//        for(int age : ages){// ham es method sa bhi pura array print kar sakta ha
//            System.out.println(age);
//        }
//        for(int i=0;i<ages.length;i++){// jitni array ki length hogi utni chalega
//            System.out.println(ages[i]);
//        }
//    }
//}
    void multiArray(){
        int arr[][] = {{2,3,4},{5,6,7},{77,66,55}};

        for(int i=0;i<arr.length;i++){
           // arr[0] and arr[1]
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}

public class Basics {
    public static void main(String[] args) {
        Array obj = new Array();// creating an obj
        //obj.demoArray();// demoArray ko call kara
        obj.multiArray();//multiArray ko call kara

    }
}

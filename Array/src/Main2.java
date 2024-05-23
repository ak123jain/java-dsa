class ArrayExample{

    void multiArray(){
        int arr[][] = {{2,3,4},{5,6,7},{77,66,55}};
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        //System.out.println(arr[0][3]);

        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
       // System.out.println();

        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
        //System.out.println(arr[2][3]);
    }
    void  demoArray(){
        int ages[] = new int[5];// size declare in array in java
        float[] weights = new float[8];
        String names[]= {"Rahul","akash","aman"};

         ages[0]= 5;
         ages[1]= 98;
         ages[4]=98;
         weights[7]=4.76f;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(weights.length);// to find the lenght of array
        System.out.println(weights[7]);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}

public class Main2 {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();// creating an obj
        //obj.demoArray();// demoArray ko call kara
        obj.multiArray();

    }
}

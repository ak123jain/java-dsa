// transpose of matrix without using extra variable

//            1 2 3    1 4 7
//    A =     4 5 6    2 5 8 = A^t   diagonal element are same but opposite element are interchange
//            7 8 9    3 6 9          and swapp eg arr[i][j] swap to arr[j][i]


import java.util.Scanner;

public class TransposeOFMatrix2 {

    static int[][] Transpose(int a[][] , int  r1 , int c1   ){
        //int b[][] = new int[c1][r1];
        for(int i=0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp  = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;
    }
    static void  PrintMatrix(int arr[][] ){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows");
        int r1 = sc.nextInt();

        System.out.println("enter column");
        int c1 = sc.nextInt();


        int a[][] = new int[r1][c1];
        // int b[][] = new int[c1][r1];


        System.out.println("enter the element of first matrix");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int b[][] = Transpose(a,r1,c1 );
        PrintMatrix(b);
    }
}

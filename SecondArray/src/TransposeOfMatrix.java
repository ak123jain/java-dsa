//// store transpose of given matrix in another matrix ?
import java.util.Scanner;

public class TransposeOfMatrix {
    static int[][] Transpose(int a[][] , int  r1 , int c1   ){
        int b[][] = new int[c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                b[i][j] = a[j][i];
            }
        }
        return b;
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

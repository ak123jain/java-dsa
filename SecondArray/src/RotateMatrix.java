import java.util.Scanner;

public class RotateMatrix {

    static int[][] Rotate(int a[][] , int  r1 , int c1   ){

        for(int i=0;i<r1;i++){
            int k1 = c1-1;
            for(int j=0;j<k1;j++){
                int temp = a[i][j];
                a[i][j] = a[i][k1];
                a[i][k1] = temp;
                k1--;
            }
        }
        return a;
    }
    static int[][] Transpose(int a[][] , int  r1 , int c1   ){
        for(int i=0;i<c1;i++){
            for(int j=i;j<r1;j++){
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

        int ans[][] = Rotate(a , r1 ,c1);

        PrintMatrix(ans);
    }
}
//j     k
//1 2 3 4
//5 6 7 8   i or k ko swap krage  pheli row ma jab hmna 1 or 4 ko swap kara to  usi row ma 2 or 3 ko bhi to
//1 2 3 4   swap karna ha esliye j++ or k-- kara
//5 6 7 83

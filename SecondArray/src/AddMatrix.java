import java.util.Scanner;

public class AddMatrix {
    static void  PrintMatrix(int arr[][]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
//            System.out.println("hello world ");
        }
    }

    static void add(int[][] a,int r1,int c1 , int [][] b ,int r2 ,int c2){
        int sum [][] = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("sum of 2 matrix");
        PrintMatrix(sum);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows");
        int r1 = sc.nextInt();

        System.out.println("enter column");
        int c1 = sc.nextInt();

        System.out.println("enter rows");
        int r2 = sc.nextInt();

        System.out.println("enter column");
        int c2 = sc.nextInt();

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];


        System.out.println("enter the element of first matrix");

        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter second matrix");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }

        add(a, r1, c1, b ,r2 ,c2);

    }
}

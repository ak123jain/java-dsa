import java.util.Scanner;

public class Leetcode {
    static void sumofrectangle(int a[][] , int  l1 ,int r1 , int l2 , int r2){
        int sum = 0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+= a[i][j];
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows");
        int r = sc.nextInt();

        System.out.println("enter column");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        System.out.println("enter the element of first matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print(" enter teh value  of : l1 ,r1 , l2 , r2 : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        sumofrectangle( a , l1 , r1 , l2 , r2);
    }
}

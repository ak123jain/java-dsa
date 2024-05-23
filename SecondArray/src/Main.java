import java.util.Scanner;

public class Main{
    static void PrintArray(int arr[][]){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows");
        int r = sc.nextInt();

        System.out.println("enter column");
        int c = sc.nextInt();

     int arr[][] = new int[r][c];

        System.out.println("enter the element");

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
           arr[i][j] = sc.nextInt();
            }
            //System.out.println();
        }

        PrintArray(arr);

    }
}
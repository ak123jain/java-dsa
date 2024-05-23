//given an positive integer n generate an n*n matrix filled with element from 1 to
// n^2 in spiral order
import java.util.Scanner;

public class SpiralMatrix {
    static void  PrintMatrix(int arr[][] ){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] GenerateSpiralmatrix(int n){// matrix jab return karta ah jab ham new
        // matrix function ma banata ha
        int matrix[][] = new int[n][n];
        int minr =0;
        int maxr = n-1;
        int minc = 0;
        int maxc= n-1;
        int totalelement = n*n;
        int CurrentElement = 1;
        // 1  2  3  4  5  6        minr print karni ha (min c sa max c) tak   minr ++
        // 7  8  9 10  11 12       maxc print karni ha (min r sa max r) tak   maxc --
        // 13 14 15 16 17 18       ab max row reverse print karna ha (maxc sa min c) tak max r--
        // 19 20 21 22 23 24        ab min c reverse print karna ha (max r sa min r) tak  minc++
        // 25 26 27 28 29 30
        while(CurrentElement<=totalelement){
            if(CurrentElement>totalelement) break;
            for(int j=minc;j<=maxc;j++){
                matrix[minr][j] = CurrentElement++;
            }
            minr++;
            if(CurrentElement>totalelement) break;
            for(int i=minr;i<=maxr;i++){
                matrix[i][maxc] = CurrentElement++;
            }
            maxc--;
            if(CurrentElement>totalelement) break;
            for(int j=maxc;j>=minc;j--){
                matrix[maxr][j] = CurrentElement++;
            }
            maxr--;
            if(CurrentElement>totalelement) break;
            for(int i=maxr;i>=minr;i--){
                matrix[i][minc] = CurrentElement++;
            }
            minc++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows");
        int n = sc.nextInt();

        int ans [][] = GenerateSpiralmatrix(n);

        PrintMatrix(ans);
    }
}

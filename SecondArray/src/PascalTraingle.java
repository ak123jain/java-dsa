//
//                      0 1 2 3 4
//                    0 1
//                 i  1 1 1
//                    2 1 2 1       2 = 1 + 1
//                    3 1 3 3 1                    3 = 2 + 1   3 = 2 + 1
//                    4 1 4 6 4 1                  4 = 1 + 3   6 = 3 + 3  4 = 3 + 1
//                                         p[i][j] = p[i-1][j] + p[i-1][j-1]
//                                         in every row first and last element are 1
//                                       jagged array ith row has (i+1)th column

//                          har row ka baad ek column bad raha ha


import java.util.Scanner;

public class PascalTraingle{
    static int[][] Pascal(int n){
        int[][] ans = new int[n][];//column fix nahi ha
        for(int i=0;i<n;i++){
            ans[i] = new int[i+1];
            /*
            ans[0] = new int[1]
            ans[1] = new int[2]
            har row ka baad ek column add kar diya
             */
            ans[i][0] = ans[i][i] = 1;
            for(int j=1;j<i;j++){// j ki value 1 sa shuru esliye kar rahe ha or khatam i se phele esliye kar
               // rahe ha kyuki ham first and last element put kar chuka ha
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
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
        System.out.println("enter n");
        int n = sc.nextInt();
        int ans[][] = Pascal(n);
        PrintMatrix(ans);
    }
}

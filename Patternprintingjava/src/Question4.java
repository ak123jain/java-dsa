import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=a;j++){
                System.out.print(" ");
            }
            a--;
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int l=i-1;l>=1;l--){//ya decreasing loop ha esliye sign change or -- bhi esliye
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
//      1    for these : loops 1 to i
//     12
//    123
//   1234
//  12345
// 123456

//
//       1    for these : loops i-1 to 1 matlab decresing loop to
//       21              for(int k=i-1;k>=1;k--);
//       321
//       4321
//       54321
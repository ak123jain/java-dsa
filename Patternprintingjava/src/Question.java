import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh no");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
// 1234567   i=1              for these triangle : i to 7 mean i to n ka loop chalana ha
// 234567    i=2                   jo no constant ha usko la lege jasa 7
// 34567     i=3
// 4567      i=4
// 67        i=5
// 7         i=7


//
//      1     i=2       for these :  1 to i-1  mean 1 sa i-1 tak loop chalega
//     12     i=3
//    123     i=3
//   1234     i=4        jo no constant ha usko la lege jasa 1
//  12345     i=5
// 123456     i=8
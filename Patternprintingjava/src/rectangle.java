import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=4;i++){// i denote no of row and j denote ki us row ma kitna star hoge
            for(int j= 1;j<=n;j++ ){// en do loop ka matlab ha jab phela loop chalta ha
                System.out.print("*");
            }
            System.out.println();// ya next line ka liye

        }
    }
}

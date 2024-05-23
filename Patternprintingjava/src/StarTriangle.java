import java.util.Scanner;

public class StarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        for(int i=1;i<=n;i++){// ham pheli line ma enter kar gaye
            for(int j=1;j<=(n+1)-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=nst;k++){// jitni baar nst ki value increase ho rahi ha utni baar loop chalega
                System.out.print("*");
            }
            nst = nst + 2;
            System.out.println();
        }
    }
}

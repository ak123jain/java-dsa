import java.util.Scanner;

//pi(5) = 1 2 3 4 5 pi(5) ka liye pi(4) ko call lagani padegi or uska baad  n ko print karega
//pi(4) = 1 2 3 4
//pi(3) = 1 2 3
//pi(2) = 1,2
//pi(1) = 1
public class Print1Ton {

     static void PrintIncreasing(int n){
        if(n == 1){
            System.out.print(" "+n);
            return ;
        }
        PrintIncreasing(n-1);
         System.out.print(" "+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintIncreasing(n);

    }
}

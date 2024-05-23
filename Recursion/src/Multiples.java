import java.util.Scanner;
// print first k multiple of n
// n = 2 k = 4
// ans = 2 4 6 8
// last vala n*k = 8 aa gaya
public class Multiples {
    static void PrintMultiples(int n,int k){
        // base case
        if(k==0){
            System.out.println(n);
            return;
        }
        PrintMultiples(n ,k-1);// n ka k multiple print karne ha last vale ko chod kar

        System.out.println(n * k);// last vala print karan aka liye
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        PrintMultiples(n,k);
        // n=5 k=5

        //f(5,4) -> f(5,3) -> f(5,2) -> f(5,1) or 5 ka 1 multiple to 5 hi hota ha to base case n
    }
}

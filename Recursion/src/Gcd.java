/// given two no x and y find the greatest common divisor of x and y using recursion
//constriant : x>=0 y<=10^6
//  x = 24 , y = 15 is divisor and 24 is divident
// 24 is divide 15 and remainder is 9 -> 24 andar 15 bahar
//  x            y
// 9 is divide 15 and remainder is 6
//  y           x
// 6 is divide 9 and remainder is 3    in all y==x  and y = remainder
// y           x
// 3 is divide 6 and remainder is 0
// y           x

// second method solution
// gcd(x,y) = gcd(y,x%y) jab ham y ko x sa divide karege
//  gcd(x,0) = x
//gcd(24,15)  -> gcd(15,9)  -> gcd(9,6) -> gcd(6,3) -> gcd(3,0) ans is 3


import java.util.Scanner;

public class Gcd {
// second method
    static int GCD(int x,int y){
        if(y==0){
            return x;
        }
        return GCD(y,x % y);
    }
    static int god(int x,int y){
        while(x % y !=0){

            int remainder = x % y;
            x = y;
            y = remainder;
        }
        return y;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter divisor");

        int x = sc.nextInt();
        System.out.println("enter divident");
        int y = sc.nextInt();

        System.out.println(god(x,y));
        System.out.println(GCD(x,y));

    }
}

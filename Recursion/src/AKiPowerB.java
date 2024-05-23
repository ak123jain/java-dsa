import java.util.Scanner;

public class AKiPowerB {

    static int power(int a ,int b ){
        if(b==0) return 1;
        return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base");
        int a = sc.nextInt();

        System.out.println("enter power");
        int b = sc.nextInt();

        int pow = power(a,b);

        System.out.println(pow);
    }
}

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter principal : ");
        float p = sc.nextFloat();

        System.out.print("enter rate : ");
        float r = sc.nextFloat();

        System.out.print("enter time : ");
        float t = sc.nextFloat();

        float SimpleInterest = p*r*t/100;

        System.out.println("SimpleInterest" +SimpleInterest);
    }
}

import java.util.Scanner;
//Ques : Two numbers are entered through the keyboard. Write a program to find the value of one
//number raised to the power of another.
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a and b : ");
        int a = sc.nextInt();// a = base
        int b = sc.nextInt();// b= power
        int ans = 1;
        for(int i=1;i<=b;i++){//loop 5 baar chalana ha
            ans = ans * a;// har baar hmare ans ma base ki multiply 1 sa hoti rahe or loop jab tak chalta rahe jitni uski power ha
        }
        System.out.println(+a+ " is raised to the power " +b+  " is : " +ans);
    }
}

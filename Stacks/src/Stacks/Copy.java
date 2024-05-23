package Stacks;

import java.util.Stack;
import java.util.Scanner;

public class Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.print("enter the  size : ");
        n = sc.nextInt();
        System.out.print("enter the element : ");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
    }
}



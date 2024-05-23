import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the element of array");
        for(int i=0;i<arr.length;i++){
         arr[i] = sc.nextInt();
        }
        for(int j=n-1;j>=0;j--){// j ki value last sa shuru ho rahi
            //System.out.println("reverse of array are");
            System.out.print(arr[j]);
        }
    }
}

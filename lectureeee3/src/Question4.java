import java.util.Scanner;
// find the sum of following series = 1-2+3-4....n
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                ans = ans - i;
            }else{
                ans = ans + i;
            }

        }

        System.out.println(ans);
    }
}

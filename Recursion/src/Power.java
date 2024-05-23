
public class Power {
    static int power(int a ,int b ){
        if(b==0)  return 1;
         int x = power(a,b/2);
        // 2^7 = 2^7/2 * 2^7/2 * 2 = 2^3 * 2^3 * 2
         if(b%2==0){
             return x*x;
         }
         else
             return x*x*a;
    }
    public static void main(String[] args) {

        System.out.println(power(2,4));
    }
}


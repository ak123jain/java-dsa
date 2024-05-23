//find the sum of digit
// d=4 , d = 1 2 3 4
// first (d-1) digit ka sum recursion sa nikalege  -> small ans
// or last ka liye hma jo recursion sa jo ans mila usma us last digit ko add kar dege -> ans

public class SumOfDigit {
    static int sod(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int smallAns = sod(n/10);

        int ans = smallAns + n%10;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sod(678));// three in one value bhi ass kar raha ha rint bhi or return bhi le raha ha
// sod is a function
    }
}

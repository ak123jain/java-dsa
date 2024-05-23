//    n = 3 , m = 27      3√(27)  == 3
//    n = 4 , m = 69      4 √(69)  == -1
//
//
//            n = 3 , m = 27     3 √(27) = 3
//
//    1    1*1*1 = 1
//    2    2*2*2 = 8
//    3    3*3*3 = 27  so 3 is ans
//
//            n = 4 , m = 69     4 √(69) = -1
//
//            1    1*1*1*1 = 1
//            2    2*2*2*2 = 16
//            3    3*3*3*3 = 81   greator than m so return -1
//            4    4*4*4*4 =
//
//    1            14                27
//    st            mid              end
//
//      mid*mid*mid > m   end = mid - 1
//
//            1              7               13
//            st            mid              end
//
//    7*7*7 > m   end = mid -1
//
//            1              3                6
//            st            mid              end
//
//    3*3*3 = 27 return mid  hma har baar mid ma hi aapna ans search karta ha
//






//Return 1 if mid == m
//Return 0 if mid < m
//Return 2 if mid > m

public class NthRoot {
    static int value(int n, int mid , int m){
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = ans * mid;
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }
    static int Root(int n , int m){
        int st = 1 , end = (int)1e9;

        while(end>=st){
            int mid = st + (end-st)/2;
            int midN = value(n,mid,m);
            if(midN == 1){
                return mid;
            }
            else if(midN == 0){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int n = 3 , m = 27;
        System.out.println(Root(n,m));
    }
}


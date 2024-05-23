// find the square root of a non negative value x round it off to the nearest floor integer value
//input x = 4
//output 2

//let x = 24 to ham ham saree no ka square root karege y = 1,2,3,4,5,n...
//  y^2 <= x  condition
// x = 24     y ki value y = 4  bcoj  16 <= 24
// second aproach
// 24 ka sqrt          0      12        24
//                     st     mid       end
//  value = mid * mid
// if(value==mid)  return ans
//  value > mid  end = mid -1
// value < mid  ->   y^2 <= x  to st = mid + 1   ans = mid  kya pata vono perfect square na ho
// to us case ma vo value na to mid ha na mid sa badi ha to ans = mid
// vo mid update bhi hoga value 24 or mid = 12  to man late ha jab mid = 4 ha to
// to 16 <= 24   or agar mid ki value = 5 hogi to vo value se badi ho gyagi
//  esliye mid = 4 par he ans return kar dege  or st = mid + 1 man lete ha mid = 1 , 2, 3
//to  1*1 < mid to eska matlab ya thodi ans mid de dege start hi mid + 1 se kar dege st = mid + 1

public class BinarySearch5 {
    static int sqrt(int x){
        int st = 0 , end = x;
        int  ans = -1;
        while(end>=st){
            int mid = st + (end-st)/2;
            int value = mid * mid;
            if(value==x){
                return mid;
            }
            else if(value > x){
                end = mid - 1;
            }
            else{// value < x
                st = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 24;
        System.out.println(sqrt(x));
    }
}

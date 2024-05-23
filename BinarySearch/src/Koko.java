//koko eat banana return the min integetr k such that the  koko will  eat the banana within h hour
//k -> banana/hour
//we have to return ans ki vo agar /hour ka hisab sa banana khata ha to vo kitna kam se kam
// banana ma or diye gaye hours ki limit ma banaan ko kahat ha
// to hmara ans 1   to 11 ka bich ma rahega
// ya to vo 1 hr ma 1 banana kha lega ya 2 3 4 5 6 7 8 9 10 11
//agar 1 hr ma 11 banana kha leta ha to given array ki limit puri hogyegi
// kyuki max 11 no ha aaray ma
//
//        1 pile ma 3 banana
//piles[] = [3  6  7  11 ]         h = 8
//
//if he eat banana/hour -> 1/1
//
//        [3    6    7    11 ]
//         3    6    7    11    total hours  = 3+6+7+11=27
//
//        if he eat banana/hour -> 2/1
//
//        [3    6    7    11 ]
//         2    3    4     6     total hour = 15
//
//        if he eat banana/hour -> 3/1
//
//        [3    6    7    11 ]
//         1    2    3     4         total hour = 10
//
//        if he eat banana/hour -> 4/1
//
//        [3    6    7    11 ]
//         1    2    2     3       total hour = 8   return
//
//if total time > 8   move on to the next and so on
//if time == h   return the ans



//1       2           3        4        5        6       7   8    9  10      11   banana
//st                                             m                            e
//
//        [3    6    7    11 ]       if he eat banana/hour -> 6/1
//         1    1    2     2
//                                 total hour = 6
//
//   agar 1 hr ma 6 banana to 3 banana kitna hr ma -> 6 / 6 -> arr[mid] / hour


//possible ans par or kam dekhege   end = mid - 1
//
//
//        1       2           3        4        5
//        st                  m                 e
//
//
//        [3    6    7    11 ]       if he eat banana/hour -> 3/1
//         1    2    3     4         total hour = 10
//
//not possible agar 3 par jyada time le raha aha to 2 1 par to or jyada
//
//        to st = mid + 1
//
//              4        5
//              st       e
//              m
//
//
//        [3    6    7    11 ]       if he eat banana/hour -> 4/1
//         1    2    2     3         total hour = 8
//
//possible ans == 4
//
//    end = mid -1
//
//eska amtlab end > st  which will braek the condition end>=st
//


import java.util.*;

public class Koko {

    static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }
    static int calculateTotalHours(int arr[], int hourly){
        int totalH = 0;

        for (int i = 0; i < arr.length; i++) {

            totalH += Math.ceil((double)(arr[i]) / (double)(hourly));
        }
         return totalH;
    }

    static int MinimumRateToEatBanana(int arr[],int h){
        int st = 1, end =  findMax(arr);
        int ans = 1;
        while(end>=st){
            int mid = st + (end-st)/2;
            int totalH = calculateTotalHours(arr,mid);
            if(totalH<=h){
               ans = mid;
                end = mid -1;
            }
            else{
                st = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int arr[] = {3,6,7,11};
        int h = 8;
        System.out.println(MinimumRateToEatBanana(arr,h));
    }
}






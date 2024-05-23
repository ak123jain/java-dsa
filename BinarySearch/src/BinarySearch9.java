//a new racing track for kids is being build in new york with 'n' starting spot the spot are located along
//the striaght line   at position x1 , x2 ,...xn (xi<=10^9) for each i  'xi+1'> xi
//at a time only m student area aloowwed to enter the race since the race track is for kids
//they may run into each other while running to prevent this we want to choose the starting spot
//such that the minimum distance between any two of them is large as possible what is the largest minimum distance
// n = 5 , m = 3
// n - no of spot  , m= no of student
// input = 1 2 4 8 9
// output = 3
//  1           2          4            8            9
//  k1          k2         k3                                 min = 1   = k2 - k1  we have to find min bw distance bw two kids at the spot
//  k1                     k2           k3                    min = 3   = k2 - k1
//  k1                     k2                        k3       min = 3   = k2 - k1
//              k1         k2                        k3       min = 2   = k2 - k1
// we have to find maximal minima = ?  en min ma sa max konsi value hogi

//   1                                     8 = a[n-1] - a[0] max possible distace bw two sp -> starting spot at which the student start the race

// in question we take value up to 10^9 but for easy dry run we take 8
  //      1             4                 8
  //      st            m                 e
// ham taki mid ko return kar sake in case 1 4 to hmara min distance hona he chahiye
//  distance bt any two kids is not less than 4

 //  1         2       4       8         9
//  k1                         k2               third student track par nahi aa raha so we have to minimize
//  distance to accomode more kids to end = mid - 1

//  1         2           3
//  st        m           e
// distance bt any two kids is not less than 2

// 1         2       4       8         9
// k1                k2      k3            possible ans = 2
// but we have to find maximal minima to essa bade no par check karege ki sare kid aa gaye

// aaga check karege st = mid + 1 agar 2 min distance par hamn kar pa rahe ha toussa kam par to kar hi dege
//esliye aaga check karta ha

//   3         3           3
//  st         m           e

// 1         2       4       8         9
// k1                k2      k3              possible ans = 3

// we want maximal minimum ans st = mid + 1
//  4                      3      condition break
//  st         m           e

// so ans = 3 agar ans possible ha to st = mid + 1  varna end = mid - 1


public class BinarySearch9 {

    static boolean isPossible(int a[],int k, int dist){// minimal distance bw two student
    int kidsPlaced = 1;// track par phela student
     int lastKid = a[0];
     for(int i=1;i<a.length;i++){// 1 sa esliye kyuki phele ko to betha diya
         if(a[i]-lastKid >= dist){// agar min distance itni ha to tabhi ham us kid ko rakh sakta ha
         kidsPlaced++;// it signify ki hma us kid ko rakh diya
             lastKid = a[i]; // ham update bhi to karege ki last kid ko hmna kaha rakha
         }
     }
     return kidsPlaced >= k;// agar saree student placed ho gaye to return kar dege
    }
//    return false;  agar saree kids placed nahi ho payee

//    dry run of above  1         2          4          8          9

 //      dist = 3   kid = 3      lastkid = 1

    //  1         2          4          8          9
    // k1                    k2                        k2 - k1 = 3 to hman aapna student ko vaha rakh diya
    // lk                    a[i]

    // kidsPlaced++ ab dusra kid ko rakhege
    //  kidsplaced = 2     lastkid = 4   i++

 //    1         2          4          8          9
//                          lk         a[i]                  k2 - k1 = 4
//                          k1          k2

//      kidsplaced = 3    lastkid = 8   i++

    //    1         2          4          8          9
//                                        lk         a[i]       9 - 8 = 1
    // not possible return

// last kids ka through ham student ko rakh rahe ha  if kidsPlaced >= k to erturn
    static int raceTrack(int a[], int k){
        if(k> a.length) return -1;
        int st = 1, end = (int) 1e9;
        int ans = 1;
        while(end>=st){
            int mid = st + (end-st)/2;
            if(isPossible(a,k,mid)){// agar mid ko min distance rakha gaye or saree student place ho gaye
             ans = mid;
             st = mid + 1;// but we want maximal minima to aaga bhi check karege
            }
            else{
            end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     int a [] = {1,2,4,8,9};
     int k = 3;
        System.out.println(raceTrack(a,k));
    }
}

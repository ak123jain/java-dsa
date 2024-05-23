//minimummno of days to make n bouquets
//bloom day = [7,7,7,7,13,11,12,7] jab hmara flower boom karaga tabhi ham
//
//        bouquets bana sakata ha   m = 2 . k = 3
//m is no of bouquets and k is adjacent flower im the bouquets
//
//        [7 ,7 ,7 ,7 ,13 ,11 ,12 ,7 ]  13 day tak hamre sare flower boom karege
//
//
//        if i am on the 13th day possible i can make 2 bouquets to ham usssa kam din par dekhege jaha hamare
//        2 bouquets ban jaye
//
//        [7 ,7 ,7 ,7 ,13 ,11 ,12 ,7 ]
//        .   .  .         .    .  .     two bouquets are ready
//
//     check on 7 th day
//        [7 ,7 ,7 ,7 ,13 ,11 ,12 ,7 ]
//        .   .  .  .              .     one flower is missing to make bouquets and three of them
//                                        are adjacent in the array
//
//        check on 12 th day
//        [7 ,7 ,7 ,7 ,13 ,11 ,12 ,7 ]   . are bloom
//        .   .  .  .       .   .  .     one flower is missing to make bouquets
//
//yes possible ans  we make two bouquets
//
//        check on 11 th day
//        [7 ,7 ,7 ,7 ,13 ,11 ,12 ,7 ]   . are bloom
//        .   .  .  .       .      .     one flower is missing to make bouquets

//  sorry we cantt make bouquets because the bloom flower is not adjacent



// agar mid he ans hota ha to ans ma hma min days pucha ha to

// check on 10 th day
//  [1 , 10 ,3 ,10 , 2 ]
//   .    .  .  .    .         n = 5


// m = 3  k = 2   m*k = 6 total flower hma 6 chahiye or ha hmare paas 5 to nahi ho sakta return -1
// ham kaha rahe ha agar pure arraya ki length sa hmare bouquets  nahi ban rahe to return -1
// if m*k > n return -1


// check on 7 th day
//        [7 ,7 ,7 ,7 ,13 ,11 ,12 ,7 ]
//        .   .  .  .              .
// jis bhi day par ham check kar rahe ha agar us elemenet par bloom kar raha ha to counter++ kar dege
// or agar hma unblomed flower mila to counter 0 kar dege
// counter ham esliye kar rahe ha taki ham ek bouquets ma 3 ka set bana sake bcoj k = 3
// or hma bl0om flower bhi adjacent chahiye
// if (arr[i]<=day) cnt++;
// if count =4 k = 3  4 blomed flower ha or 3 need ha bouquets pura karna ka liye
//  4/3 = 1  bouquets is ready
// counter = 1  , k = 3
// 1/3 = 0



//for (int i = 0; i < n; i++) {         [7 ,7 ,7 ,7 ,13 ,11 ,12 ,7 ]
//        if (arr[i] <= day) {           check on 7th day  cnt = 4 k = 3
//        cnt++;
//        } else {
//        noOfB += (cnt / k);      cnt = 4 no of b = 1 cnt = 0 yaha par hma cnt ki value 0 esliye kari taki dusra bouquets
//        cnt = 0;
//        }
//        }
//        noOfB += (cnt / k);
//        return noOfB >= m;











public class CodingNinja {

    static boolean Possiblebouquets(int[] bloomDay,int minDays , int k, int m){
        int cnt = 0;
        int noOfB = 0;
        for(int i=0;i<bloomDay.length;i++){
          if(bloomDay[i]<=minDays){
              cnt++;
          }
          else{
              noOfB += (cnt/k);
              cnt =0;
          }
        }
        noOfB += (cnt/k);
        return noOfB>=m;
    }
    static int bouquets(int[] bloomDay,int m,int k){
        int val =  m * k;
        int n = bloomDay.length;
        if (val > n) return -1;
        int st = 1 , end = (int)1e9;
        while(end>=st){
            int mid = st + (end-st)/2;
              if(Possiblebouquets(bloomDay,mid,k,m)){
                  end = mid - 1;
              }
              else{
                  st = mid +1;
              }
        }
        return st;
    }
    public static void main(String[] args) {
       int bloomDay[] = {1,10,3,10,2};
        int m=3; int k= 1;
        System.out.println("min days to make m bouquets : " +bouquets(bloomDay,m,k));
    }
}
// agar - 1 aaya We cannot make m bouquets

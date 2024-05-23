package stacks;

public class MaxWindowSliding {
    public static void main(String[] args) {

    }
}


//  nums = [1,3,-1,-3,5,3,6,7], k = 3
// result ka array ka size n-(k-1) = n-k+1

// window ka size 3 ha
/// to ma aase 6 window he bana sakta hu jisma ma max elemet search kar raha hu to ma 6 baar travel karuga num ka size jitna travel nahi karuga i<n-(k-1)
// ma 2 baar kam travel karuga k-1
// esliye mana n ma se n - (k-1) kar diya


//Explanation:
//        Window position                Max
//        ---------------               -----
//        [1  3  -1] -3  5  3  6  7       3
//        1 [3  -1  -3] 5  3  6  7       3
//        1  3 [-1  -3  5] 3  6  7       5
//        1  3  -1 [-3  5  3] 6  7       5
//        1  3  -1  -3 [5  3  6] 7       6
//        1  3  -1  -3  5 [3  6  7]      7



// idx      0 1  2  3 4 5 6 7
//  nums = [1,3,-1,-3,5,3,6,7]
//  nge     1 4  4  4 6 6 7 -1

// jiska nge -1 ha yani vo he max ha us window ma
// ans =  3  3  5  5  6  7
// next greator element ka idx
// k = 3 window size
//  window ma jis element ka nge us window se bahar ha vo hmara greator element ha us window ka


//while(j<i+k){// yani jab tak ye condition ha tab tak ham window ka andar ha jab condition break to window ka bahar matlab nge window ka bahar ha
//        max = nums[j];
//        j = nge[j];//j ka andar nge dal rha hu
//        }
//        ans[z++] = max;

// eg
//                  i+k
//  nums = [1, 2  3  4  5  6  7  8],
//  nge     2  3  4  5  6  7  8  -1
//          i
//          j

// k = 3  i = 1 ,  i + k = 4
// i + k window se just bahar ka ek no
// j mera window ma nge searck kar rha ha
// agar meri j ki value i+k sa badi ha to matlab mera nge window se bahar ha

// ek window ma max element return hone ke baad
//
//                     i+k
//  nums = [1, 2  3  4  5  6  7  8],
//  nge     2  3  4  5  6  7  8  -1
//             i
//                   j

// ab muje code ke hisab se j ko i par lana padega to code galat ho gyega
// to jab tak j<i+k hoga to  ham jo ko vahi rakhege

// kyuki ab j mera purani window ka sabse bada element ha

// j mera purani window ka nge element ha
// if(j>=i+k) j = i => tabhi ma j = i karuga

// kyuki j mera window se he bahar chala gya

// kyuki j mera window ka andar he hona chahiye taki vo nge bata sake window ma

// kyuki mereko ko j ko baar baar j ko travel nahi karana
// j hmesha mera purani window ka nge par hoga to ma vahi se continue karuga piche nahi jyuga agar vo mera new window ma ha tabhi 







































package Stacks;

import java.util.Stack;

public class ConsecutiveSequence {
    public static int[] remove(int arr[]){
        int n = arr.length;
        Stack<Integer> st = new Stack();

        for(int i=0;i<n;i++){
//            if(st.size()==0) st.push(arr[i]);
//         if(st.peek()!=arr[i]) st.push(arr[i]);
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if(st.peek()==arr[i]){// i==n-1 agar ham last element par ha tab to ma pop kar he duga
                 if(i==n-1 || arr[i]!=arr[i+1]) st.pop();// agar dono equal ha matlab 10 tin baar ha or mana agar pop kar diya to aage ka(tisra vala 10 ha array ma) 10 ka liye condition check nahi ho payga kyuki stack me ma 10 to phele he auda diya
            }
        }
        // stack ka element array ma dalna ha to jab bhi ma stack se element niklata hu to vo muje last vala element phele milta ha or phele vala sabse baad me
        int res[] = new int[st.size()];// mana stack se new array bana kar usma value dal de
        int m = res.length;// stack se array me dalna ha
        for(int i=m-1;i>=0;i--){// array ka andar mana piche se element store karana shuru kar diya kyuki stack ma aupar se eleent milte ha
            res[i] = st.pop();
        }
        return res;
    }
    public static void main(String[] args) {
     int [] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7};
     int [] res = remove(arr);
     for(int i=0;i<res.length;i++){
         System.out.print(res[i] + " ");
      }
    }
}

// given a sequence of number remove all the consecutive sequence = jo hmare  ek he sequence ma ha of length greator than or equal to 2 that contain the same element

// 1  2  2  3  10  10  10  4  4  4  5  7  7  2
// same element remove karna  ha jo cs ma ho or unki length 2 ya 2 se jada ho
// enko remove karka array return kar duga
// consecutive sequence = one by one

// 1  2  2  3  10  10  10  4  4  4  5  7  7  2
// res = 1  3  5  2

// // 1  2  2  3  10  10  10  4  4  4  5  7  7  2

// muje ye element autha kar stack ma dalna ha
// agar mera size ==0 ha stack ka to ma bas element push kar duga
// phir ma check karuga ki mera stack ka peak element agar array ka next ka equal hua to ma pop kar duga lekin agar aaray ma phir se vo repeated eleemnt aaya to ma stack ma vo dalna padega kyuki ab stack ma me check kissa karu ki vo repeated ha ki nahi kyuki usko to mana pop kar diya
// esliye ab ma jabhi pop karuga jab mera array ma arr[i]!=arr[i+1] tab he ma pop karuga
// kyuki agar vo equal hua to mera 10 stack ma aa gaye ga










  





















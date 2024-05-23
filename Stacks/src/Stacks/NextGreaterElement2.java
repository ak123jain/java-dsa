package Stacks;

import java.util.Stack;

public class NextGreaterElement2 {
    public static int[] remove(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        int n = arr.length;
        st.push(arr[n-1]);
        res[n-1] = -1;// 4 ko -1 de diya
        for (int i = n - 2; i >= 0; i--) {
            while ( st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) res[i] = -1;
            else {// st.peek>arr[i]
                res[i] = st.peek();
            }
            st.push(arr[i]);// aaga vale element push bhi to karuga jese 3 ka baad 6 jabhi to condition check hogi
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,  3 , 2,  1 , 8   ,6 , 3 , 4};
        int n = arr.length;

        int [] result = remove(arr);
        // print the orignal array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        // Print the result array
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

// NextGreaterElement
// input : 1  3  2  1  8   6  3  4

// ek stack banaya mana 4 ko -1 de diya kyuki 4 ka NextGreaterElement koi nahi ha
//
// mana stack ka anda last element 4 dal diya st.push(arr[n-1])
//



//
// // input : 1  3  2  1  8   6  3  4
//  res :                          -1
//  ab ma aapna loop chaluga 3 se or 3 ko check karuga agar mere stack ka top ma element  3 se bada ha to ma 3 ka res ma 4 dal duga lekin agar chota ha to ma stack ka element ko pop kar duga phir ma check karuga st.peek>3 to ma usko 3 ka res ma dal duga
// // agar mera stack ma element 3 se chota ha to direct pop kar duga stack ka us element ko or man lete ha stack mera khali ho gaya to ma res ma -1 rakh duga matlab us element ka nextgreator element koi nahi ha
// muje baas stack ma element dalka aaga ka eleemnt check karna ha ki ussa bada element to koi nahi ha agar ha to uska res ma dal varna pop kar de

// overall agar curr element ka size stack ka peak se chota ha curr element ka res ma vo peek dal dege or agar peek chota ha to pop kar dge
































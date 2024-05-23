//package stacks;
//
//import java.util.Stack;
//
//public class GeeksForGeeks {
//    public static void main(String[] args) {
//        Stack<Integer> st = new Stack<>();
//        for(int i=0;i<n;i++){
//            st.push(i);
//        }
//        while(st.size()>1){
//            int v1 = st.pop();
//            int v2 = st.pop();
//            if(M[v1][v2]==0){// v1 v2 ko nahi janta to shayad v1 celeb ho sakta ah or or jab v2 ko v1 nahi janta to v2 to celeb nahi ho sakta to v2 pop
//              st.push(v1);
//            }
//            else if(M[v2][v1]==0) st.push(v2);
//        }
//        if(st.size()==0) return -1;// koi celeb nahi ha
//         int potential = st.pop();//
//        for(int j=0;j<n;j++){
//            if(M[potential][j]==1) return -1;
//        }
//        for(int i=0;i<n;i++){// ab columnn wise check kar rahe ha ki koi or 0 to nahi ha
//            if(i==potential) continue;
//            if(M[i][potential]==0) return -1;// jo mera 0 zero to ha he
//        }
//        return potential;
//    }
//}


// celebrity question
// esma celebrity kisi ko nahi janta or sab celebrity ko janta ha
//     0  1   2 (idx)
// 0   0  1   0
// 1   0  0   0
// 2   0  1   0
//(idx)

// 0 1 ko janta ha esliye 1
// 0 2 ko nahi janta esliye 0
// 1th idx is celeb bcoj vo kisi ko nahi janta

// jis row kaa saare elemenet 0 ha vo index celeb ha


// mana stack ma n= 3
// 2 v1
// 1 v2
// 0

// celeeb ki condition vo kisi ko nahi janta par sab usko janta ha
// sabse phele 2 or 1 ko pop kiya
// 2 mera agar 1 ko janta hoga to 1 aayega or nahi janta to 0 aayega
// if(M[v1][v2]==1) Matlab 2 mera 1 ko  janta ha so 2 celeb nahi ho sakta ha to 2 ko pop 1 ko vapis dal dege st.push(v2)
// if(M[v2][v1]==1) (( else condition )) matlab 1 mera agar 2 ko ganta ha tab bhi 2 to celeb ha he kyuki celeb ko sab janta ah st.push(v1)

//if(M[v1][v2]==1){// v1 v2 ko nahi janta to shayad v1 celeb ho sakta ah or or jab v2 ko v1 nahi janta to v2 to celeb nahi ho sakta to v2 pop
//        st.push(v2);
//        }
//        else if(M[v2][v1]==1) st.push(v1);

// int potential = st.pop();// yaha jo bhi mera idx jo kisi ko nahi janta vo aa gaya man lete ha 1 idx ha to us row ma 0 hona chahiye
//        for(int j=0;j<n;j++){
//            if(M[potential][j]==1) return -1;// row vo he ha column change ho rahe ha us row ma har element 0 hona chaiye agar 1 ha to -1 koi koi celeb nahi ha
//        }

//     0  1   2 (idx)
// 0   0  1   0
// 1   0  0   0
// 2   0  1   0
//(idx)

// muje vaha se jo bhi idx mila ki vo shayad celeb ho sakta haa
// to uska row ma saare element 0 hone chahiye or column ma uska alawa koi 0 nahi hona chahiye
// row ma 0 esliye ki vo kisi ko nahi janta or column ma 1 esliye kyuki usko sab janta ha














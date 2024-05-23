    //return all teh subsequence  in an arralist,given an string
//  f('abc') = abc ,ab ,ac ,a ,b ,c ,bc ," "
// f('bc') =                   b ,c ,bc ," "  // agar f('bc') ka andar ma a add kar du to f('abc') ban gyega
//           abc ,ab ,ac ,a  f('bc') ma a add kar diya + f('bc') ek baar as it is likh diya
// f('abc') =  ( f('bc') + a ) + f('bc')
// n=3 total subsequence = 2^n = 8


import java.util.ArrayList;

public class Subsequence {
    static ArrayList<String> getSSQ(String s){

        ArrayList<String> ans = new ArrayList<>();
        if(s.length()==0){
            ans.add("");
            return ans;
        }

        char curr = s.charAt(0);// 0 index par a add kar rahe ha

        ArrayList<String> smallAns = getSSQ(s.substring(1));//  f('abc') ->  f('bc') ->  f('c') ->  f(' ')
        // es line ma matlab 1 index par ji bhi element hoga vo ek ek karke hata dega

        for(String ss: smallAns){// smallans ka andar  jo string ha  usko ss variable ma read kar rahe
            ans.add(ss);// phir vo strind add kardi main ans ma
            ans.add(curr + ss);// or phir sa usko add kara 'a; ka sath
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        for(String ss : ans){// ans ka andar jo bhi chij ha vo ss ma aa gyi
            System.out.println(ss);
        }

    }
} //plz see a dry run in lecture 35

// print all he susequence without arraylist
public class Subsequence2 {
    static void printSSQ(String s,String currans){
        if(s.length()==0){
            System.out.println(currans);
            return ;
        }
        char curr = s.charAt(0);// 0 index par jo element hoga usko add kar dega

        String remString = s.substring(1);// ya line abc ma sa phele a ko hata degi
        //eska andar jo bhi string aayega usma sa vo 0 index vale element ko hata dega or baki rakh lega
        // curr char -> choose to be a part of currans
        // ek barr add karege
        printSSQ(remString ,currans + curr);
        // curr char ->  does not choose to be a part of currans
        // or ek baar nahi karege
        printSSQ(remString ,currans );

    }
    public static void main(String[] args) {
     printSSQ("abc","");
    }
}
  //  plz see a dry run in lecture 35
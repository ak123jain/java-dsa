package StringsBasics;
//the strin should be compressed such that the consecutive duplicate of character are replaced with the charcter
//and followed by the number of consecutive duplicate
// input = aaabbbccddde
//output = a3b3d4e
public class LeetCode {
    public static void main(String[] args) {
   String str = "aaabbbccdddzeeeee";
   String ans = "" + str.charAt(0);//a
   // 0 idx par hmna a esliye man liya taki usko aaga vale elemeent sa easily compare kar saku
   int count = 1;

   for(int i=1;i<str.length();i++){
       char curr = str.charAt(i);
       char pv = str.charAt(i-1);
       if(curr==pv){
           count++;
       }
       else{// curr!=prev
           if(count>1)// kyuki ham nahi chahata ki 1 print ho agar ek hi alphabet ho
            ans += count;// kyuki a ko phele sa ha
            count = 1;// count ko refresh kar diya
            ans += curr;// a to mere paas phele sa ha ans ma prev ma to ma curr ma b ha to usko add kar duga
       }
   }
        if(count>1)// kyuki ham nahi chahata ki 1 print ho
            ans += count;// ye esliye kyuki e ka case me else ki condition hit nahi ho rahi kyuki ans
        // ma count tab add hoga jab curr!=prev lekin e ka aaga to uch ha he nahi esliye e ka
        // esliye e ka count ko aalag se print kara

        System.out.println(ans);
    }
}


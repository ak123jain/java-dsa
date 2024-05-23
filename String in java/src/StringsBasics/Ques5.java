package StringsBasics;


// input :  am an educator
//output :  ma na rotacude
// we make empty str builder then add (am) in it and jab hmari spaci aayegi tab existing str ko reverse kar
// dege or str builder ko khali kar dege or jab space nahi ha to us character ko add kar lege str builder
// me or space aane ka baad reverse kar dege or ans ma add kar dege or str builder ko clear kar dege
// ans ma space dene ka baad
public class Ques5 {
    public static void main(String[] args) {
        String str = "I am an online educator";
        // hma educator ka space chahiye taki vo vo bhi reverse ho sake
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{// agar space hoga
                sb.reverse();
                ans += sb;
                ans += " ";
                sb.delete(0,sb.length());
            }
        }
        System.out.println(sb);// hmara sb ka andar educator to ha lekin uska side ma space nahi ha
        // esliye vo reverse nahi hua esliye ham use phele reverse phir ans ma add
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}

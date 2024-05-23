 // given an string (2,3)  containing digit from 0-9 erteurn all possible letter combination that the no could represent
// example -> 23
//{ad,ae,af,bd,be,bf,cd,ce,cf}

public class Telephone {
    static void combination(String dig ,String []kp ,String ans){// "253" -> kp[2]
        if(dig.length()==0){
            System.out.println(ans + " ");
            return;
        }
        //dig.charAt(0);//2 milega par vo character par hma integer chahiye
        // agar isme sa 0 - kar le to integer mil jyega
        int currNum = dig.charAt(0) - '0';// 2
        // 2 ka pass choices kon kon si ha
        String currChoices = kp[currNum]; // "abc"

        for( int i=0;i<currChoices.length();i++){
            combination(dig.substring(1),kp,ans+currChoices.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s = "23";
        //kp[7] = "pqrs
        String [] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //               0  1   2     3    4      5     6      7     8      9

        combination(s,kp,"");

    }
}

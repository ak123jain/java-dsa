public class SubStrings {
    public static void main(String[] args) {
        //substring = continous part of string
        //String str = "abcc";
        //substrings = a , ab , abc , abcc , b , bc , bcc , c , cc
//        System.out.println(str.substring(0,4));// in only str.substring first index is included and second is excluded
//        System.out.println(str.substring(1));// essa agga sare idx print ho jyege
        String str = "physics";
        for(int j=2;j<4;j++){
            System.out.print(str.substring(j));
        }
    }
}
// ysics  sics print hoga

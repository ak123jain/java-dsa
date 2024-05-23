package StringsBasics;

//given a string return the no of palindrome substring in it
// ham given string ki substring nikalege or us substring me palindrome kitne ha vo check karege
// input = "abc"
// sustring = a , ab , abc , b , bc , c
// palindrome substring = a, b , c ,  a single character is always a substring or palindrome substring
public class Ques4 {
    public static boolean isPalindrome(String s){

        int i = 0;
        int j = s.length()-1;
        while(j>i){
             if(s.charAt(i)!=s.charAt(j))
                 return false;
             i++;
             j--;
        }
         return true;
    }
    public static void main(String[] args) {
      String str = "abcba";
      int count = 0;
      for(int i=0;i<str.length();i++){
          for(int j=i+1;j<=str.length();j++){
            if(isPalindrome(str.substring(i,j))==true){
                  System.out.println(str.substring(i,j) +" ");
                  count++;
              }
          }
      }
        System.out.print("the no of palindrome substring are " +count);

    }
}

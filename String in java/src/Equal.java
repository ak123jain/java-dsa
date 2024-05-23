public class Equal {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}

// Equal indentify true or false  ki equal ha to true varna false s3 is new string and s1 and s2 are same
// strings equal sign check adress of two string s1 and s2 ek he adrees ko ppoint karege
// or s3 alag adress ko
// inspite of equal we use srt.equal to check the equality of string in these they cannot check the adress
// they check the string

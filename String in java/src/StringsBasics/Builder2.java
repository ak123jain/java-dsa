package StringsBasics;

public class Builder2 {
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("physics");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.delete(2,4);// delete from 2 to 3
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        System.out.println(str.substring(3));
    }
}

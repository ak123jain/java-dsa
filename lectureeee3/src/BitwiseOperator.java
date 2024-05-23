public class BitwiseOperator {
    public static void main(String[] args) {
        int p = 9 , q = 10;

        System.out.println(p | q); // OR operator = 11
        System.out.println(p & q);// AND operator = 8
        System.out.println(p ^ q);// XOR operator = 3

        // left wise  operator
        System.out.println(p << 1); //ek bar left wise operator = formula = a*2^b = 9*2^1 = 18
        System.out.println(p << 2);// do baar left wise operator = 36

        // right wise operator
        System.out.println(q >> 1);//ek baar right wise operator = formula = a/2^b = 10/2^1 = 5
        System.out.println(q >> 2);// do baar right wise operator = 10 / 2^2 = 2
    }
}

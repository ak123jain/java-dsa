public class UnaryOperators {
    public static void main(String[] args) {
        int p = 5 , q = 5;

        System.out.println(p++);//5 phele value assign ho gyi phir increament ho gya
        System.out.println(p);//6

        System.out.println(++q);//6 phele increment ho gya phir assign ho gyi
        System.out.println(q);//6

        int x = p++;
        int y = ++q;

        System.out.println(x);//6 phele assign ho gyi below
        System.out.println(y);//7

        System.out.println(p);//7 bad ma increment ho gya
        System.out.println(q);//7
    }
}

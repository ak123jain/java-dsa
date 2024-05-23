public class LogicalOperator {
    public static void main(String[] args) {
        int p = 15 , q = 10 , r = 5;

        // && operator
        System.out.println((p>q)  &&  (p>r));
        System.out.println((p>q)  &&  (p<r));

        // || operator
        System.out.println((r<q)  || (p<q));//true
        System.out.println((p>q)  ||  (q>r));//true
        System.out.println((p<q)  || (q<r));//false

        //! operator
        System.out.println(!(p==q));
        System.out.println(!(p>q));








    }
}

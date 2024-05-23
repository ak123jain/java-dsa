public class Algebra3 {
    static void decreasing(int a,int b){
        a--;
        b = b-2;
        System.out.println(a+":"+b);
    }
    public static void main(String[] args) {
        int p = 10;
        int q = 2;
        decreasing(p,q);
        System.out.println(p+":"+q);
    }
}

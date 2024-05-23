public class Main2 {
    static void Welcome(){// static keyword mean (single copy for whole class)
        System.out.println("welcome to pw");
    }
    public static void main(String[] args) {
        Welcome();
    }
}
// agar ham static keyword ka use kar rahe to obj create karna ki jarurat nahi ha agar static keyword nahi hota
// to hma function ko call karna ka liye obj ki jarurat padti
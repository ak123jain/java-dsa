public class Algebra2 {

    static int changevalue(int a){// static ma obj ka through value pass karna ki jarurat nahi padti
        a *= 100;
        return  a;
    }
    public static void main(String[]args) {
        int a = 10;
        System.out.println("before changing value"+a);
          changevalue(a);
        System.out.println("after changing value"+a);// java ma sirf pass by value hoti ha pass by reference nahi hota

    }
}
//   java ka andar agar ham aese hi value bheje ge to vo change nahi hogi par array ma value change ho gyagi
// baki c language ma bina aaray ka * method ya (pass by reference )
//ka through value change ho gati ha par java ma koi pass by reference nahi hota
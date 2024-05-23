// calling a method ?

//import java.util.Scanner;
//
//class Algebra{
//    int add(int a,int b){// add is method and int ,int b is parameter
//        int ans = a+b;
//        return a+b;
//    }
//}
//
//public class Age {
//    public static void main(String[] args) {
//        Algebra obj1 = new Algebra();//creating an object + Algebra() is a constructor
//        // class ka name ko hi constructor bolte ha
//        // constructor = special method used to initialize object
//        //constructor name = class name
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("sum of input no");
//
//
//         int ans = obj1.add(a,b);// object 1 ka method ko call kara or value pass kari
//
//        System.out.println(ans);
//
//
//    }
//}


//import java.util.Scanner;

class Algebra{

    int a;
    int b;

    Algebra(int x,int y){// Algebra class ka constructor = parameterized constructor
        System.out.println("constructor of algebra class called");
        a = x;
        b = y;
    }
    int add(){// add is method and int ,int b is parameter
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}

public class Age {
    public static void main(String[] args) {

        Algebra obj = new Algebra(5,7);// ya object constructor ko call karega or x or y ki value pass kar dega

        //Scanner sc = new Scanner(System.in);scanner importjab arta ha jab user sa input lena hota ha

//        int a = sc.nextInt();
//        int b = sc.nextInt();

        System.out.println("sum of input no");

        System.out.println(obj.add());
        System.out.println(obj.sub());
        System.out.println(obj.mul());

        Algebra obj2 = new Algebra(10,7);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());


    }
}
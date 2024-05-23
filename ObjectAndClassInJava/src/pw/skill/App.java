package pw.skill;

public class App{
    public String str_1 = "I am a public member";// ham class ka ander public member ko print karna ha

    void printFromClass() {// method
        System.out.println("within a class : " + str_1);
    }

    public static void main(String[] args) {// main function sa hmesha call jati ha
        App obj = new App();
        obj.printFromClass();// obj ka through printFromClass ko call kari
        System.out.println(obj.str_1);
        App2 obj2 = new App2();
        obj2.printFromOutsideClass();// obj ka through printFromOutsideClass ko call kari
        System.out.println(obj.str_1);
    }
}
    // ab  hma dusri class ma public member print karna ha or  same package ma
       class App2{
        void printFromOutsideClass(){
            App obj = new App();
            System.out.println("within a package outside class: "+ obj.str_1);
        }

    }


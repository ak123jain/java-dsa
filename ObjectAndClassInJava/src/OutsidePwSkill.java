import pw.skill.App;

public class OutsidePwSkill {
    public static void main(String[] args) {
        App obj = new App();
        System.out.println("outside package non child class " + obj.str_1);//parent class

        App3 obj3 = new App3();
        obj3.printFromOutsideClass();
    }
}
// child class
class App3 extends App{
    void printFromOutsideClass(){
        App3 obj3 = new App3();
        System.out.println( "child class"+obj3.str_1);
    }
}
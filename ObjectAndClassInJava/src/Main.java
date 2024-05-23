class Student{
    int rollNo;
    String StudentName;
}
public class Main {//creating a class and public is access modifier
    public static void main(String[] args) {

    Student obj1 =  new Student();// creating an object => classname objectName = New classname();
    obj1.rollNo = 1;
    obj1.StudentName = "Akash";
        System.out.println(obj1.rollNo);
        System.out.println(obj1.StudentName);

        Student obj2 = new Student();
        obj2.rollNo = 3;
        obj2.StudentName = "AmanJain";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.StudentName);
    }
}
// imp : ek java file ma multiple class ho sakti ha par public class ek hi ho sakti ha or hmna jis
// class ko public banaya  ha us class ma main method aayega
// jis name sa file banai ha us hi name sa public class hogi

// three four of access modifier are :public:private:default:protected

//
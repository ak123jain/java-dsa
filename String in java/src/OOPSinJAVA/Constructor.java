package OOPSinJAVA;

public class Constructor {
    public static void main(String[] args) {
        // ham usingconstructor sa uski property ko inherit kar leye
        UsingConstructor C = new UsingConstructor("raghav",78,89.9);
        // value paas kari constructor ko

        // default value ma ham obj ki properties ko niche bhi intialize kar sakte ha
//        C.name = "akash";
//        C.percent = 98.9;
//        C.rno = 78;

        System.out.println(C.name);
        System.out.println(C.rno);
        System.out.println(C.percent);
        System.out.println(C.schoolName);
        System.out.println(C.getNoofStudents());// ma noofstudent ko obj sa bhi get kar sakta hu or class se bhi
        System.out.println(UsingConstructor.getNoofStudents());// ham noofstudent ko tabhi get kar sakte ha jab ham getter function ma static use karage kyuki ye static ha
// har obj ka pass appna saperate no of student ka collection ha
        // lekin ma chata hu ki no of student obj par depend na kare classs par depend kare
        // har obj ka paas no of student ki alag counting ha par ma chahata hu ki puri counting ek sath add ho gaye
        // ma ye nahi chahat ki individually sabke liye noofstudent ka block bane
        // ek single block ban gaye to aapna aap update ho jese he ek obj create ho
        // no ofstudent obj dependent na ho class dependent ho
        // so i am using static key word

        // new obj is created
        UsingConstructor  c2 = new UsingConstructor ("akash",98,98.9);

//        System.out.println(c2.name);
//        System.out.println(c2.rno);
//        System.out.println(c2.percent);
        System.out.println(c2.getNoofStudents());
    }
}

// mana yaha par properties ko inherit bhi kara or dusri class ma
//constructor bhi kara
// or constructor ==> to initiate the obj

// default value ma ham obj ki properties ko niche bhi intialize kar sakte ha
//        C.name = "akash";
//        C.percent = 98.9;
//        C.rno = 78;

// static = har obj ka liye ek no of student badh raha tha lekin jab hmna static ka use kara to ek aalag se no of student ka block bana diya jisma obj create hone ka baad chije add ho rahe ha
// to no of student object par depend nahi kar raha class par depend kar raha ki us class ma kitna obj bane ha


// static ham common propery par lagata ha eg college name , no of student , company name of employee
// MAIN DEFINATION :  static variable will get the memory only once, if any object is created  value of the static variable, it will retain its value eg no of student
// jab bhi hmara obj create hoga to static variable us ki value ko retain karega
// kyuki obj bana to hmara class sehe ha
// static  laga he esliye ha taki jab bhi obj create ho to tab noofstudent increase ho gata ha to vo aalag aalag obj ma na ho static ek allag se noofstudent ka box bana dega to jab bhi obj create hoga to value usma increase ho gyegi

// static is used to acess a function in the class through classname.function eg => UsingConstructor.getNoofStudents()
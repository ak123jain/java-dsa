package OOPSinJAVA;


public class UsingConstructor {// this file attached with constructor


        // eski properties inherit kar saku
        String name;// we can also write private
        public int rno;
        double percent;

        final String schoolName = "rishabh";// schoolname ek final variable ha esko ham change nahi kar sakte
        private static int noofStudents;// ham esma ab static keyword ka use kar rahe ha to ab ham esko kisi dusri class ma bhi use karka value ma change kar sakte ha
        // to ye drawback ha  esliye ham private ka use kar rahe ha or getter function ka use kareg taki ham taki ham dusri class ma use kar paye

    public UsingConstructor(){  // default constructor

    }

    public UsingConstructor(String name,int rno,double percent){//value receive kari or usko naam da diya
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        noofStudents++;// jab bhi mera ek obj create hua to mera noofstudent 1 ho gaya
     }

     public static int getNoofStudents(){// noofstudent hmara static ha to yaha hma static use krna ha
        return noofStudents;
     }//or getter function ka use kareg taki ham taki ham dusri class ma use kar paye or koi bhi aapki value get to karle lekin change na kare


    public static void main(String[] args) {

    }
}

//    constructor in Java is a special method that is used to initialize objects.
//        The constructor is called when an object of a class is created.
//        It can be used to set initial values for object attributes(properties)

// jab ham kisi class ka obj ko create karta ha or uska attribute ki value ko set karta ha


// agar hmna koi constructor nahi banaya to default chal gata ha
//
// default constructor chalega obj ko niche initialze kara ha constructor nahi banaya
// constructor ==> obj ko initiallize karna constructor ka andar
// constructor ma ham vahi par obj ko intialize karta ha
//  Constructor C = new Constructor("raghav",78,89.9);
//        C.name = "akash";
//        C.percent = 98.9;
//        C.rno = 78;

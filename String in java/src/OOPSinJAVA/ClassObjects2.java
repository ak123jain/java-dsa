package OOPSinJAVA;

public class ClassObjects2 {
    public static class Student{// creating a user defined data type
        String name;
        int age;
        double percent;
    }

    // student data type
    public static void fun(Student x){// vo functionn jisma ham value paas kar rahe ha
        System.out.println(x.name);
        System.out.println(x.percent);
        return;
    }

    public static void change(Student x){
        x.name = "Naman";
    }
    public static void main(String[] args) {
        Student x = new Student();// hmna x name sa ek dabba banaya  (creating object) declaration
        // initialization
        x.name = "Akash";
        x.age = 19;
        x.percent = 98.8;
        fun(x);// value paas
        System.out.println(x.name);
        change(x);//value change karn aka liye pas ki
        System.out.println(x.name);
        System.out.println(x.getClass());
    }
}

// most important note jo bhi ham user defined data type banata ha usko ham main function ka bahar
// banana prefer karta ha taki agar ham uski value paas karna chahaye to pass kar sake
// agar hmna user defined data type main ka andar he ban diya to uski value ko ham paas nahi kar sakte
// uski aukat us main function ka andar hi rah jyegi


// jo user defined class ha are passed by reference matlab ham value to paas hoti hi ha sath me uska adresss
// bhi paas hota ha esliye ham value paas karn ak baad bhi change kar sakte ha
// eg in above code we change name from akash to naman
// par normal array me sirf pass by value hoti ha pass by reference nahi
// ham agar baad me value paas karn achahaye to  naho kar sakte
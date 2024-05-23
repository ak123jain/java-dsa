package OOPSinJAVA;
//class -> classs has multiple object(entities) (eg 50 student) in which particular properties are common
//        they are called class
//
//ek class ka multiple object hote ha matlab entities jinki kuch particular properties common hoti ha
//        to uska blue print ko ham class bolte ha
//        example of common properties are name ,class ,roll no
//
//        so student is a class
//
//user defined data type
//        int roll , string name , double roll no

// we make new data type
public class ClassesObject {

    // creating a new data type using below line
    public static class Student{// user defined data type
        String name;
        int age;
        double percent;
    }

    public static void main(String[] args) {
        //  if i want to store common properties of student
        // student is a data type
        Student x = new Student();// hmna x name sa ek dabba banaya  (creating object) declaration
        // initialization
        x.name = "Akash";
        x.age = 19;
        x.percent = 98.8;
        System.out.println(x.age);

        Student s = new Student();// class has multiple object
        // initialization
        s.name = "Akshat";
        s.age = 189;
        s.percent = 40.8;
        System.out.println(s.percent);
    }
}

// benefit of this code
// man lete ha hma hma name , roll no, class ko store karna ha to hma 3 array banana padte the aalag aalg
// data type ke ab hma ek he data type banaya (student) or ma ab es new data type ka array bana duga
// because we can declare array from its data type
// ham array ko kisi data type ka through declare karta ha or ab hma jo new data type banan ha student
// uska through ham array ko declare kar dege
// int ka array char ka array or es new data type ka array to ab hma multiple data type declare karna ki
// need nahi ha us hi data type ma ham multiple chije store kar le



// obj are real world entities and classes are blue print are used to categorised the several object
// obj of same class have same properties
// object mean student -> properties of 50 student -> class rollN age -> are same
// in this class is user defined data type jisma ham multiple attribute/properties ko store kar sakte ha
// without declaring its individual data type


// most important note jo bhi ham user defined data type banata ha usko ham main function ka bahar
// banana prefer karta ha taki agar ham uski value paas karna chahaye to pass kar sake
// agar hmna user defined data type main ka andar he ban diya to uski value ko ham paas nahi kar sakte
// uski aukat us main function ka andar hi rah jyegi
package OOPSinJAVA;

public class Person {// join with geeter setter class
    public static void main(String[] args) {
        GetterSetter.Person person = new GetterSetter.Person();// ye syntax person class se properties inherit karna ka liye

        // Use the setter method
        person.setName("John Doe");// hmna value paas kari ha to set function in person class

        // Use the getter method
        String name = person.getName();

        System.out.println("Name: " + name);
    }
}
    


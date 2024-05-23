import java.util.*;

public class Interning {
    public static void main(String[] args) {
    String str = "hello";
    String gtr = "hello";
   // str.charAt(1) = "d"; this is not correct in java string
        // 2 -> 'y'
       str =  str.substring(0,2) + 'y' + str.substring(3);// ye ek new string ban gyi this is
        // ye tino alag string ha alag adress ko point karti hui
        // immutability of string we cannot change the string itself but change the reference or adress by making new string
        // immutability why reason ?  interning
        // kyuki agar  immutability  nahi hoti to to ham string ka andar change kar sakte the
        // to sare usme jo bhi connected the vo bhi change ho gyega or interning disturped ho gyegi
        // ya jo point kar rahe the same adress ko vo alag ho gyege
        // second reason is security

    gtr = "mello";// ab heap ma new string ban gayi new adrees ka sath
        System.out.println(str);
        System.out.println(gtr);

    }
}


//interning concept
//stirngs str = "hello"           stacks       heap
//strings gtr = "hello"    gtr    *500         hello  with adress *500
//                         str    *500
//
//
//
// heap ka andatr hmari string store ho gyi  or stacks ka andar adress  ha or str or gtr vo dono hello
//        ko poimt kar rahi ha same adress par
// conclusion both strings are same
//
//ham jo new string bana rahe ha phele vo check karega ki vo string heap ma ha to new string nahi banayega
//us he string ka adrees ko point karega  strings std = "kash"  to heap ma new string banege neew adress ka sath
//or agar phele sa vo string hui to new string nahi banegi purina string ka adress ko point karegi

// advantage of interning that we do not make same string in heap to save memeory
// and avoid interning by making new string in above code


// suppose we add asd in akash string
// string = "akash"
 //  "akasha"  "akashas"  "akashasd" to ye tino alag string ha
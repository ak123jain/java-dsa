package Stacks;

public class MinStack {
    public static void main(String[] args) {

    }
}

// 1 2 3 4 5 6
// stack ma mana element dal diya
// ab mana min element getmin function ki help se 1 nikal diya
// lekin suppose mana 1 ko pop kar diya to mera min element change ho gaya 2 ho gaya
// to ma haar baar getmin function ma ek naya stack bana luga
//note = har stack ka min elemenet aalag hota ha
// lekin ye bekar method ha kyuki jab bhi ma pop karuga to minelement shayad change ho sakta ha
// or muja har baar minelement nikal ne ka liye new stack banana pad raha ha to meri tc bad gayi
// muje har step par aapna min elemeent chahiye


//Approach 2 => 7  8  5  6  3  4


// 4      3  pure stack ka min 3 ha
// 3      3
// 6      5
// 5      5
// 8      7   st me ma as it is element dal diya lekin min stack ma ma check karuga 7 ke baad ki naya element agar 7 se chota ha to ma usko push kar duga lekin agar bada ha to ma as it is 7 ko he push kar duga
// 7      7
// st    min   (do stack banaye)


//jab ma pop karuga dono ma to mereko har step par min value mil gyegi


// check  copy for approach 3

















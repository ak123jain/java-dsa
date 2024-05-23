//given a string s print all the substring of s
// input s = "abcd"
// output -> substrings = a , ab , abc , abcd , b , bc , bcd , c , cd  ,  d

//      a
//      a  b             b
//      a  b  c          b  c        c
//      a  b  c  d       b  c  d     c   d    d



public class Ques1 {
    public static void main(String[] args) {
    String str = "abcd";
    for(int i=0;i<=3;i++){// eska no included bracket ma lgega
        for(int j=i+1;j<=4;j++){ // eska no excluded ma lagega
            System.out.print(str.substring(i,j) + " ");
        }
     }
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
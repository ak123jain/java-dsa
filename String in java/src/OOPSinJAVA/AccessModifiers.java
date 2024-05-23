package OOPSinJAVA;

public class AccessModifiers {
    public static class Students{// creating a user defined data type
         String name;
        private int rno;
        double percent;
    }
    public static void main(String[] args) {
        Students s = new Students();
        s.rno = 98;
        s.name = "akash";

        //s.roll = 8; but we cannot inher the roll no bcoz it is private
        // it is used when jab hmari koi particular chij private rahe koi or usse acess na kar sake

        System.out.println(s.rno);

    }
}


//1 private ma (same package) ma bhi nahi acess kar sakte or same class me
//2 public ham ese kisi bhi (other package) me  eski properties ko access kar sakte ha
//3 default ham (same package )ma chijo ko acess kar sakte ha kisi other package ma nahi kar sakte



package OOPSinJAVA;

public class Fraction {

    //7/3 + 3/7 = 7*7+3*3/3*7 num => phele ka numerator dusra ka denominator + phele ka den or dusra ka num , den => phela den * dusra ka den
    public static Fractions add(Fractions f1 , Fractions f2){// add function hmara fraction ma store ha to uska return type bhi fraction hoga
       int numerator = f1.num*f2.den + f1.den*f2.num;
       int denominator = f1.den*f2.den;
       Fractions f3 = new Fractions(numerator,denominator);// or ye aapna aap simplify ho gyega kyuki ma esko construcor ka through bana raha hu
        return f3;
    }
    public static Fractions multiply(Fractions f1 , Fractions f2){// add function hmara fraction ma store ha to uska return type bhi fraction hoga
        int numerator = f1.num*f2.num;
        int denominator = f1.den*f2.den;
        Fractions f4 = new Fractions(numerator,denominator);// or ye aapna aap simplify ho gyega kyuki ma esko construcor ka through bana raha hu
        return f4;
    }

    public static int gcd(int num , int den){// gcd hmna int ma liya esliye es function ka return type int
        // ma num or den ma se min no nikaluga or us min no ko jab tak loop ma chaluga jab tak vo 1 ka equal nahi ho gata or agar vo (min no) num or den dono sa divisible ha to vo hcf ha return
     int min = Math.min(num,den);
     for(int i=min;i>=1;i--){
         if(num%i==0 && den%i==0) return i;
     }
     return min;
    }
    public static class Fractions{// created class from obj
        int num;
        int den;

        public Fractions(int num , int den){// constructor ka ek he kaam ha obj ko initialize karna or jo class ka name vo he constructor ka name
         this.num = num;
         this.den = den;
         simplify();
        }
        public void simplify(){
         int hcf = gcd(num,den);// gcd hmna int ma liya esliye es function ka return type int
         num /= hcf;
         den /= hcf;
        }
    }
    public static void main(String[] args) {
        Fractions f1 = new Fractions(35,21);// obj
        System.out.println(f1.num+"/"+ f1.den);
        Fractions f2 = new Fractions(7,3);// obj
        System.out.println(f2.num+"/"+ f2.den);
        Fractions f3 = add(f1,f2);// 35/21 + 7/3 = 4/1
        System.out.println(f3.num+"/"+ f3.den);
        Fractions f4 = multiply(f1,f2);
        System.out.println(f4.num+"/"+ f4.den);
    }
}


//  a/b =  a or b ka jo bhi hcf hoga unko divide kardo a or b se
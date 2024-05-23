package OOPSinJAVA;
public class GetterSetter {// we can implement gettersetter by using person
    public static class Person {// ab ma constructor name sa he class banauga taki ma usma
        //taki  eski properties inherit kar saku
            String name;// we can also write private
        public int rno;
        double percent;
        public String getName() {// getter
            return name;
        }
        public void setName(String newName) {// setter -> change karna -> value aagi gyi getter setter class se
            this.name = newName;// or usko hmna newname ma dal diya
            // with using this key we represent name uniquely or ma dono variable same bhi rakh sakta hu
            // this represent es class ka name ko represent karta ha
        }
    }
}

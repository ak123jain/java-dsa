
import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMapMethods();
    }
    static void HashMapMethods(){

        Map<String , Integer> mp = new HashMap<>();// key string ki form ma or value integer ki form ma
        mp.put("Akash",23);// key akash and value 21
        mp.put("yah",16);
        mp.put("yash",16);
        mp.put("lay",16);
        mp.put("ankit",16);
        mp.put("modi",16);

        // get return the value if key exist

        System.out.println(mp.get("yah"));// key ka corresponding value get kar sakte ha
        System.out.println(mp.get("kash"));
        mp.put("Akash",25);// put are used to insert the value and update the value
        System.out.println(mp.get("Akash"));
        mp.remove("modi");
        System.out.println(mp.remove("riya"));

        System.out.println(mp.containsKey("Akash"));
        mp.putIfAbsent("yashika",98);// will enter
        mp.putIfAbsent("yash",987);// will not enter

        System.out.println(mp.keySet());
        System.out.println(mp.values());
        System.out.println(mp.entrySet());

        // es key ka andat keyset read hoga -> jo ki string h
        for(String key : mp.keySet()){// key set ma sirf key thi jo ki string type ha esliye string data type declare kara
            System.out.printf("Age of %s is %d\n " , key , mp.get(key));
        }

        //System.out.println(mp.keySet());
        System.out.println();
        // entryset ka datatyp declare kar diya
        for(Map.Entry<String , Integer> e : mp.entrySet()){// entry set ma key bhi ha or value bhi bhi to dono ka datatt type declare karne padege
            System.out.printf("Age of %s is %d " , e.getKey(), e.getValue());
        }
        System.out.println();
        System.out.println();

        // e ka andar entry set read hoga or eska data type intellij khud samaj lega we dont need to mention
        for(var e : mp.entrySet()){// entry set ma key bhi ha or value bhi bhi to dono ka datatt type declare karne padege
            System.out.printf("Age of %s is %d " , e.getKey(), e.getValue());
        }
    }
}

// when we use hashmap => when we map key value pair then we use this data structure

// we are in a speaker store and i want to map the speaker with their prive


// key is speaker name and value is price

// speaker1      price
// JBL            8,000
// BOAT           7,000
// INTEX           200
// KEY             VALUE


// tc = 0(1)

// tc is less because of such operation are used in hashmap -> searching , deletion , insertion ,

// array ma to pura travel karna padega


// map interface can be implemented by 1 hashmap 2 linked hashmap 3 sorted map






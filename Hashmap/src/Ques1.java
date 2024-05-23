
// given an array fing the most frequent element in the array that is most repeated
// print it

// arr[] = 1,3,2,1,4,1


import java.util.HashMap;
import java.util.Map;

public class Ques1 {
    public static void main(String[] args) {
        HashMap<Integer , Integer> mp = new HashMap<>();
        int arr[] = {1,3,2,9,1,4,1,6,9,9,9};
        for(int er : arr){// aar ko er ma read kara
            if(!mp.containsKey(er)){ // agar mp ma vo key phele se nahi ha to add kar uski key ko uski val ka sath
                mp.put(er,1);// key or value sath me add karte ha
            }
            else{// agar vo key phele se h to val++ kar dege
                mp.put(er,mp.get(er)+1);// us map ki value aase get karte ha
            }
        }
        System.out.println(mp.entrySet());// ab hmna saree key with uski val nikal di => val kitni baar ha vo bhi nikla di => ab bas konsi key ki val max ha vo nikal ne ha
        int maxfreq = 0; int anskey = -1;
        for(var e: mp.entrySet()){
            if(e.getValue() >maxfreq){
                maxfreq = e.getValue();
                anskey = e.getKey();
            }
        }
        System.out.println(anskey);
        // second method
//        int maxfreq = 0; int anskey = -1;
//        for(var e: mp.keySet()){// key ham e ka andar read kar rahe
//            if(mp.get(e) >maxfreq){//mp.get(e) matlab value
//                maxfreq = mp.get(e);
//                anskey = e;
//            }
//        }
//        System.out.println(anskey);
    }
}


// key -> element of array
// value -> freq of element -> ki vo element kitni baar ha

// key ma saree element daal dege or jo elememnt repeat hoge unki frequency ++ yani value ++

// hashmap ma ma pair ha ek key ka or ek value ka
// agar mp ma phele se 1 nahi ha to add kar dege or ha to uski freq ++ kar dege


// hma vo key niklani ha jiski freq max ha
// ham phir pure hashmap ma travel karege
//or int maxfreq = 0; int anskey = -1; bana lege
// if(agar us key ki value > maxfreq) se jyada ha to maxfreq ma us key ki value daal dege
// or phir us he key ko anskey ma daal dege
// aase karka ma saree key ki max value nikal luga or max val ki key ko ma anskey ma dal duga



//note = ham aapna hashmap ko do tarika se travel kar rahe ha ek (entryset) se or (keyset) se

// ENTRYSET MA HAMe jab key get karni ha to getkey() or jab value larni ho to getvalue kyuki entry set ma ket or value dono ha

// keyset => ma jab key get karni ho to key to vo he ha or value ka liye hashsetname.get(jisma travel kar rahe ha)

//for(String key : mp.keySet()){// key set ma sirf key thi jo ki string type ha esliye string data type declare kara
//        System.out.printf("Age of %s is %d\n " , key , mp.get(key));
//        }

//for(var e : mp.entrySet()){// entry set ma key bhi ha or value bhi bhi to dono ka datatt type declare karne padege
//        System.out.printf("Age of %s is %d " , e.getKey(), e.getValue());
//        }

// tc of this 0(n) for above for loopsl
















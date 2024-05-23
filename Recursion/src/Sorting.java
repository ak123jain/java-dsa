// given an array of name of the fruit you are supposed to sort in lexicographical order using the selection sort
// input = papaya lime watermelon apple mango kiwi
// output = apple kiwi lime mango papaya watermelon
// lexicographical order ma each letter ko compare karta ha
// eg -> apple or kiwi a phele atta ha or k bad ma aata ha
// college < cot  c and o are same but l phele aata ha or t bad ma aata ha
public class Sorting {// agar array ka size n ha to last index n-1 hoga

    static void  sortFruit(String[] fruit){
        int n = fruit.length;
        for(int i=0;i<n-1;i++){// n-1 last element ka index
            int minidx = i;// ham aapna first element ko hi min man lete ha or phir usko sare bache ve element sa comparee karta ha
            for(int j=i;j<=n-1;j++){ // last element tak
                if(fruit[j].compareTo(fruit[minidx])<0){
                    minidx = j;
                }
            }
            String temp = fruit[i];
            fruit[i] = fruit[minidx];
            fruit[minidx] = temp;
        }
    }
    public static void main(String[] args) {
        String [] fruit = {"kiwi","apple","papaya","mango","lime","watermelon"};
        sortFruit(fruit);
        for(String st : fruit){
            System.out.println(st + " ");
        }

    }
}

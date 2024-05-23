// wap to check the given string is palindrome or not?

public class Palindrome {

    static void  sortFruit(String[] fruit){
        int n = fruit.length;
        for(int i=0;i<n-1;i++){
            int minidx = i;
           for(int j=i+1;j<n;j++){
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
  String [] fruit = {"kiwi","apple","papaya","mango"};
  sortFruit(fruit);
  for(String st : fruit){
      System.out.println(st + " ");
  }

    }
}

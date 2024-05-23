// given q queries check if the given no is present in the arrayor not
// value of all the element in the array is less than 10 to the power of 5?
import java.util.Scanner;
public class FrequencyArray {
    static int[] makeFrequencyArray(int arr[]){
        int [] freq = new int[1005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter teh element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int freq[] = makeFrequencyArray(arr);

        System.out.println("enter teh queries");
        int q = sc.nextInt();// query mean ham kitna x element ko search kar sakte ha

        while(q>0){
            System.out.println("enter element to be searched");
            int x = sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            q--;
        }
    }
}
// ham ek array sa frequency aray banayege
// arr[5] = {1,2,3,4,5}
//to freq array [5] = {0,0,0,0,0}

//array ka 0 index par 1 ha freq array ka 1 index par +1 add ho gyega

//freq arr{0,1,1,1,1}

// ham pura array ko travel karta ha or jo bhi eska andar hma value mil rahi ha
// ham us value ko freq array ka index samajkar
// us freq array ki index ma jo element ha usko ++ kar cete ha
// or man lete ha ki ham x=5 element search kar rahe ha to ham frequency array ka 5 index ma check karege
// ki 0 ha ya nahi
// jis element ka bare ma pucha ha usko freq array ka index ma check karege 0 ha ki nahi
// jo freq array banaga ussay pata chalega konsa element array ka kini baar aa raha
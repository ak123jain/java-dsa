//given an array of size n containing only 0s and 1s and 2s sort the array in asending order
//input n = 6
//arr = 0 2 1 2 0 0
//output 0 0 0 1 2 2
//  sorted by count sort
// first make frequency array

public class Question8 {

    static void displayArr(int num[]){
        for(int val : num){
            System.out.print(val + " ");
        }
    }
    static void sort(int[] num){
        int count_0 = 0 ,count_1 = 0 ,count_2 = 0;
        for(int j : num){
            if(j==0){
                count_0++;
            } else if (j==1) {
                count_1++;
            }
            else{
                count_2++;
            }
        }
        int k=0;
        while(count_0>0){
            num[k++] = 0;
            count_0--;
        }
        while(count_1>0){
            num[k++] = 1;
            count_1--;
        }
        while(count_2>0){
            num[k++] = 2;
            count_2--;
        }
    }
    public static void main(String[] args) {
        int[] num = {2,2,1,2,2,0,1,0,2,0};
        sort(num);
        displayArr(num);
    }
}

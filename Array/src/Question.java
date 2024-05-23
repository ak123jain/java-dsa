//search the given element x in the array if present then return the index and if not then return -1
public class Question {
    public static void main(String[] args) {
        int arr[] = {1,5,3};
        int x= 5;
        int ans = -1;
        for(int i=0;i<3;i++){
            if(arr[i]==x){
                ans = i;

                System.out.println(ans);
            }
        }
        if(ans ==-1){
            System.out.println("not found an ans");
        }
    }
}
// note : array ma memory allocation contiguous hota ha matlab agar phela integer 1001 ma store ho raha ha
// to dusra 1005 ma hoga kyuki ek integer 4 byte leta ha
// note stacks = (reference variable) arr[5] ya koi variable a,
// heap = esma 5 element ki memory mil jati ha
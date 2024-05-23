public class LastIndex {

    static int last(int arr[], int n,int target, int idx){
        if(idx<0) return -1;
        if(arr[idx] == target){
            return idx;
        }
        return last(arr,n,target,idx-1);
    }
    public static void main(String[] args) {
        int arr[] = {4,2,3,4,5,4,7,9};
        int target = 4;
        int n = arr.length;

        System.out.println(last(arr,n,target,n-1));
    }
}

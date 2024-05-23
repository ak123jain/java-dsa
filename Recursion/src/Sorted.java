public class Sorted {
    static Boolean sorted(int arr[] ,int n ,int idx){
        if(idx==n-1) return true;

        if(arr[idx] < arr[idx+1]){
            return sorted(arr ,n,idx+1);
        }
        return  false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};

        if(sorted(arr,arr.length,0)){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}

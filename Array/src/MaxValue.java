public class MaxValue {
    public static void main(String[] args) {
        int arr[]={34,5,7,8,3};
        int max = arr[0];
        for(int i=0;i<4;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}

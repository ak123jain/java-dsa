// recursion question 9

public class FrogJump {
    static int best(int h[], int n, int idx){
        if(idx == n-1) return 0;// ham last point par ha or last point sa last tak jane ka cost 0
        int op1 = Math.abs(h[idx]-h[idx+1]) + best(h,n,idx+1);
        //best(h,n,idx+1); esma idx+1 sa n-1 tak jana ha
        //0 index sa idx+1 tak ki cost nikal lege en dono ki absolute value agar hman en dono pt ki value nikal li to 0 index sa n-1 index tak ki  value niklana aasan ha
        if(idx == n-2) return op1;// agar ham last pt sa ek phele ha to op1 hi ko return kar dege
        int op2 = Math.abs(h[idx]-h[idx+2]) + best(h,n,idx+2);
        //best(h,n,idx+2); esma idx+2 sa n-1 tak jana ha
        //0 index sa idx+2 tak ki cost nikal lege en dono ki absolute value agar hman en dono pt ki value nikal li to 0 index sa n-1 index tak ki  value niklana aasan ha
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int h[] = {10,30,40,20};
        System.out.println(best(h,h.length,0));

    }
}
//   
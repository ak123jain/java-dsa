// search element in rotated sorted array with duplicate element retrn true if the lemenet
// is found varna false

// agar rotation pt eska bich ma ha  to arry sorted nahi ha
// lets take condition st != mid  and mid == end
// two equal thing mid sa end ka bich ma pivot lie nahi kar raha -> to mid sa end sorted ha
//matlab agar pivot lie nahi kar raha to sorted ha
// agar mid == end to vo part sorted hi hoga to hma alag sa condition lagane ki jarurat nahi
// agar  mid == end to st or mid ka basis par cecision liya jaye kyuki vo to sorted he ha
// or agar vo sorted ha to ham target usma check kar sakte ha
//  phele jese ham karta the target sirf sorted array ma hi check karege 
public class BinarySearch7 {
    static int search(int a[], int target){
        int st = 0 , end = a.length-1;

        while(end>=st){
            int mid = st + (end-st)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[st]==a[mid] && a[end]== a[mid]){
                st++;
                end--;
            }
            else if(a[mid]<=a[end]){// agar dono equal bh ha tab bhi pivot enka bich lie nahi karega to ya sorted
                if(target > a[mid] && target <= a[end]){
                    st = mid + 1;
                } else{
                    end = mid - 1;
                }
            }// agar aupar vala else if nahi hua to
            else{
                if(target >= a[st]  && target < a[mid]){
                    end = mid - 1;
                }
                else{
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {1,1,1,2,2,2,3,1};
        int target = 2;
        System.out.println(search(a,target));
    }
}

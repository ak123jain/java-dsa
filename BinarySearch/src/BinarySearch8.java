//you have less than n<= 10^5 boxes of chocolate each box contain a[i] in which a[i]<10^4 chocolate
//you need to distribute this boxes   among m student     such that the max no of chocolate allocate to the
//student is minimum
//1 one box is allocated to exactly one student
//2 all the boxes should be allocated
//3 each student has to be allocated at least one box
//4 allotment should be contiguous order for instance , a student cannot be allocated box 1 and box 3
// skipping box 2
// calculate and return that minimum possible no


// n = 3 m = 3 n is no of boxes and m is no of student in which we distribute chocolate

//   5       3     1      4      2   chocolate
//   0       1     2      3      4   boxes

//s1    0(5)         0(5)          01(8)        0(5)          01(8)    phele student ko 0 vala box da diya phir 0 or 1 dono ek sath
//s2    1(3)         12(4)         23(5)       123(8)          2(1)      alag alag case ha
//s3    234(7)       34(6)          4(2)         4(2)           34(6)
//max    7            6              8             8              8

// min max = 6

//    st == 1 ek box ka andar atleast one chocolate to hogi
// end = no of chocolate in each box * no of box
// lets only assume end = 15     st = 1
// we can distribute chocolate to student less than or equal to middle value == 8
//    5       3     1      4      2   chocolate

//        1                8                  15
//        s                m                   e

//  s1 = 5 + 3 = 8
// s2 = 1 + 4 + 2 = 7                    possible ans = 8
// s3 = koi si bhi less than but less than 8
// we will find minimal ans to ham chahege 8 se kam ma kam ho gaye
// ham da to 8 sa bhi jyada ha ha par vo minimal maximam nahi hoga
// but we want the smaller ans than 8 to end = mid - 1
// mid to 11 bhi ho sakta ha eska matlab vo thodi ham 11 lege

//        1                4                   7
//        s                m                   e
// 4 sa jyada chocolate kisi student ki nhi de sakta
// 4 is the max chocolate allowed

//    5       3     1      4      2   chocolate


//  s1 = 5  condition break  ham ya box vali chocolate kisi student ko nahi de sakta
//  s2 =
//  s3 =

// agar ,max choc 3 dege tab bhi nahi kam chalga
//  5 se piche nahi ja sakta kyuki phele student ko 5 to deni hi padegi
//  st = mid + 1

//          5                6                   7
//          s                m                   e

//    5       3     1      4      2   chocolate
 //  condition break  ham ya box vali chocolate kisi student ko nahi de sakta

//  s1 = 5
//  s2 = 3 + 1 = 4
//  s3 = 4 + 2  = 6   possible ans = 6

// par ham minimal maximun chahiye to ham or kam dekhege
// to phir sa end = mid - 1  6 sa phele search karege

//       5                5                   5
//       s                m                   e

//    5       3     1      4      2   chocolate

//  s1 = 5
//  s2 = 3 + 1 = 4
//  s3 = 4 + 2  = 4
//  s4 = 2   char student nahi le sakta
//  5 se piche nahi ja sakta kyuki phele student ko 5 to deni hi padegi

//   st = mid + 1
//     6       5      condition break end >= st
//     s       e
// to final possible ans == 6

// benefits of sorted array = agar ham eg 1 2 3 4 5 6 7 8
//  agar ham 5 par ans mil gaya 5 se phele vale element discard kar sakta ha
// vase i 5 par ans mil gaya to 5 ka baad hi ham search karege
public class BinarySearch8 {
     static boolean isDivisionPossible(int a[],int m,int mxChocolateAllow){// mid == mxChocolateAllow
        int NoOfStudent = 1;// phela student
        int Choc = 0; // phele student ka paas 0 choc ha or no of choc curr student has

        for(int i=0;i<a.length;i++){// loop for boxes
            if(a[i]>mxChocolateAllow) return false;// agar phele box ma mxChocolateAllow sa bhi jada ha to
            if(Choc + a[i] <= mxChocolateAllow){// ham choc esliye add kar rahe agar hmna kisi student ko 3 choc de di or uska baad 2 or di to vo purani vali choc bhi add rahe
                // or jab condition break to next student
                // a[i] is also choc
                // 1 student ko hmna ya vali choc de di after checking condition
              Choc += a[i];// jab tak condition true ha tab tak ham us student ko hi chocolate dete rhege
            }
            else{
                NoOfStudent++;
                Choc = a[i];// jo hmara naya studeent hoga usko ham purani vali choc nahi de sakta
            }
        }
        if(NoOfStudent > m) return false;
        return true;
    }
     static int DistributeChocolate(int a[],int m){
         if(a.length<m) return -1; // boxes hi kam ha student jada ha
         int ans = 0, st = 1 , end = (int)1e9;
         while(end >= st){
             int mid = st + (end-st)/2;
             if(isDivisionPossible(a,m,mid)){// check -> mid ko max chocolate allow rakh kar division possible ha ki nahi
             ans = mid;
             end = mid - 1;// end bcoj or aacha solution
             }
             else{
                 st = mid + 1;
             }
         }
         return ans;
     }
    public static void main(String[] args) {
    int a[] = {12,34,67,90};
    int m = 2;// student
        System.out.println(DistributeChocolate(a,m));
    }
}

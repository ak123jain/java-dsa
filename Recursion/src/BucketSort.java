import java.util.ArrayList;
import java.util.Collections;
//put all the element in the b no of bucket
//sort each bucket individually using insetion sort or any sort
//take out all teh element and join them
//arr = 7,19,25,14,5,20,11,23,1 we made 5 bucket and put all the element in the bucket using bucket range
//  the first bucket range is from 1-5 and second is 6-10 , 11-15 , 16-20 , 21-25
// the range of array is from 1-25
// agar arr aesa ha ki elemeent uniformly distribute ho raha ha bucket ma to har bucket ko sortkarna ma
// kam time lagta ha to overall time complexity kam ho gati ha
// bucket sort jab hi lagana ha jab element uniformly distributed ho
// sort an array having no in range [0.0 to 1.0] with uniformly distributed efficient way to sort
// 0.42 , 0.32 , 0.25 , 0.52 , 0.23 , 0.47 , 0.51 ,0.92 , 0.68 , 0.75 , 0.636
// 9 bucket ha 1 2 3 4 5 6 7 8 9
// to no dalan aka liye ham 0.42*10 = 4.2  = 4 to 4th bucket ma dal dege
// arraylist sa hum array ka size change kar sakte ha
// arraylist esliye kyuki hma nahi pata bucket ka andar kitni value jyegi to length fix nahi ha
// esliye hmna arraylist use kara har bucket ka liye taki kitna bhi size ham chnge kar sakta ha
public class BucketSort {

    static void bucketSort(float[] arr){
   // jitna size os array ha utni bucket
        int n = arr.length;
//        int a[] = new int[5];

        ArrayList<Float> [] buckets = new ArrayList[n];
        // create empty bucket
        for(int i=0;i<n;i++){
            buckets[i] = new ArrayList<Float>();// har ek bucket par ek naya arraylist
        }

        // add element into our bucket
        for(int i=0;i<n;i++){
            int bucketIndex = (int)arr[i] * n;// jo hmare pass element aayega us element ko becket ka index man kar vaha element put karna ha
            // array ka andar se index mila or us idx or bucket ma us idx ma vo arr ka element add kar dege
            buckets[bucketIndex].add(arr[i]);
        }
        // sort each bucket individually
        for(int i=0;i< buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        // merge all bucket to get final sorted array
        int index = 0;
        for(int i=0;i< buckets.length;i++){// we use arraylist bcoj we dont  know the no of element in thr bucket
            ArrayList<Float> currBucket = buckets[i];// hmna har bucket ko array list sa represent kara ha
        for(int j=0;j< currBucket.size();j++){
            arr[index++] = currBucket.get(j);
        }
        }
    }
    public static void main(String[] args) {
    float[] arr = {0.5f,0.4f,0.3f,0.2f,0.1f};
    bucketSort(arr);
    for(float val : arr){// arr ki value val ma read karege
        System.out.println(val + " ");
    }
    }
}

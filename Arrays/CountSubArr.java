package Arrays;
import java.util.*;

public class CountSubArr {
    public static void main(String[] args) {
        //This is the brute force approach its time complexity is 0(n^3)....
//         int [] arr = {1,1,1};
//         int p = 2;
//         int n = arr.length;
//         int count = 0;

//         for(int i = 0 ; i < n;i++){
//             for(int j = i;j <n;j++){
//                 int sum = 0;
//                 for(int k = i;k <= j;k++){
//                     sum += arr[k]; 
//                 }
//                 if(sum  == p){
//                     count++;
//                 }
//             }
//         }
//         System.out.println("The count is:"+count);
//     }
// }
           HashMap<Integer,Integer> mpp = new HashMap<>();

           int[] arr = {3, 4, 7, 2, -3, 1, 4, 2, 1, 3};
           int k = 7;
           int n = arr.length;

           mpp.put(0,1);//imp base case when prefix - k = 0;

           int prefixSum = 0;
           int count = 0;

           for(int i = 0; i < n ; i++){
            prefixSum += arr[i];

            if(mpp.containsKey(prefixSum - k)){
                count += mpp.get(prefixSum - k);
            }

            mpp.put(prefixSum, mpp.getOrDefault(prefixSum,0)+1);
        }
        System.out.println("The Count is :"+count);
    }
}
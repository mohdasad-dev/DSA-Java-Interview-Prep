// import java.util.*;
// public class MaxSubarray_BruteForce{
//     public static void printSubarrays(int number[]){
//         for(int i=0; i<number.length; i++){
//             int start = i;
//             for(int j=i; j<number.length; j++){
//                 int end = j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(number[k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String arg[]){
//         int number[] = {2,4,6,8,10};
//         printSubarrays(number);
//     }
// }



import java.util.*;
public class MaxSubarray_BruteForce{
    public static void maxSumOfSubarray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<number.length; i++){
            int start = i;
            for(int j=i; j<number.length; j++){
                int end = j;
                currSum = 0;

                for(int k=start; k<=end; k++){
                    //subarray sum 
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                        maxSum = currSum;
                }
            }
        }
         System.out.println("max sum =  " + maxSum);
    }
    public static void main(String arg[]){
        // int number[] = {2,4,6,8,10};
        int number[] = {1, -2, 6, -1, 3};
        maxSumOfSubarray(number);
    }
}
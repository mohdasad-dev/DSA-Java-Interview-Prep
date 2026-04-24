import java.util.*;
public class MaxSubarray_Kadane{
    public static void maxSumOfSubarray(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<number.length; i++){
            currSum += number[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("our maximum sum is = " + maxSum);

    }

    public static void main(String arg[]){
        int number[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSumOfSubarray(number);
    }

}
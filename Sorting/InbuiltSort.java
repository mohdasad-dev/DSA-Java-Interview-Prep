import java.util.Arrays;
import java.util.Collections;
public class InbuiltSort{
    
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String arg[]){
        Integer arr[] = {5,4,1,3,2};

        // Standard sorting (ascending)
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);


        // (decending)
        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        //  Display the result
        printArr(arr);
    }
}
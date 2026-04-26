import java.util.*;
public class InsertionSort{
    public static void insertSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            // Finding out the current position to insert
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Insertion.

            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        int arr[] = {5, 4, 1, 3, 2};
        insertSort(arr);
        printArr(arr);
    }
}


// Use the following sorting algorithms tosort an array in DESCENDING order

import java.util.*;
public class InsertionSort{
    public static void insertSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            // Finding out the current position to insert
            while(prev >= 0 && arr[prev] < curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // Insertion.

            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        insertSort(arr);
        printArr(arr);
    }
}
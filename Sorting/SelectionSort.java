import java.util.*;
public class SelectionSort{
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){    //turns
            int minPos = i;                   // minPosition is currentPosition
            int max = Integer.MAX_VALUE;      // it will check the unSorted to find the minimum
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        int arr[] = {5, 4, 1 , 3, 2};
        selectionSort(arr);
        printArr(arr);
    }
}


// Use the following sorting algorithms tosort an array in DESCENDING order


import java.util.*;
public class SelectionSort{
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){    //turns
            int minPos = i;                   // minPosition is currentPosition
            int max = Integer.MAX_VALUE;      // it will check the unSorted to find the minimum
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }

            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String arg[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr);
        printArr(arr);
    }
}
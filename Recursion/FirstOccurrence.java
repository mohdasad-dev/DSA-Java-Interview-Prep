// WAF to find the first occurrences of an element in an array

public class FirstOccurrence{
    public static int firstOccur(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOccur(arr, key, i+1);
    } 
    public static void main(String arg[]){
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccur(arr, 5, 0));
    }
}
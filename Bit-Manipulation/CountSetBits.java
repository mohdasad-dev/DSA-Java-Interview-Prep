import java.util.*;
public class CountSetBits{
    public static int countSet(int n ){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){ //check our LSB 
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String arg[]){
        System.out.println(countSet(10));
    }
}
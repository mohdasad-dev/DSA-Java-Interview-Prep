import java.util.*;
public class PowerOfTwo{
    public static boolean isPowerOfTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static void main(String arg[]){
        System.out.println(isPowerOfTwo(8));
    }
}
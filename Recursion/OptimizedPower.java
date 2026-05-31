
// let try in optimize O(logn)




public class OptimizedPower{
    public static int optimizedPower(int a, int n){

        if(n == 0){
            return 1;
        }
        
        // if n is Even.
        int halfPower =  optimizedPower(a, n/2);
        int halfPowerSq = halfPower  * halfPower;

        // if n is odd.

        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;

    }
    public static void main(String arg[]){
        System.out.println(optimizedPower(2, 10));
    }
}

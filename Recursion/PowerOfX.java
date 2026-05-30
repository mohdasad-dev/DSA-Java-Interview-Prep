// public class PowerOfX{
//     public static int power(int x, int n){
//         if(n == 0){
//             return 1;
//         }

//         return x * power(x, n-1);
//     }
//     public static void main(String arg[]){
//         System.out.println(power(2, 10));
//     }
// }


// This method will take time compleexity as a O(n) asa well as Space Complexity is O(n); so it is not good for us or you can say that its a worst case.

// let try in optimize O(logn)




public class PowerOfX{
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

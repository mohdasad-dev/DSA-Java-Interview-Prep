public class PowerOfX{
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        return x * power(x, n-1);
    }
    public static void main(String arg[]){
        System.out.println(power(2, 10));
    }
}


// This method will take time compleexity as a O(n) asa well as Space Complexity is O(n); so it is not good for us or you can say that its a worst case.

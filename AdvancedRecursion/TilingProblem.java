public class TilingProblem{
    public static int tilingProb(int n){  // 2 * n (floor size)
        if(n == 0 || n == 1){
            return 1;
        }
        // vertical choice
        int fnm1 = tilingProb(n-1);

        //horizontal choice
        int fnm2 = tilingProb(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String arg[]){
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
    }
}